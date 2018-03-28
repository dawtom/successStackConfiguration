package examples.controller;

import examples.HibernateUtil;
import examples.Student;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class FXMLExampleController {
    @FXML
    private Text actiontarget;

    @FXML private TextField sthFunnyIdField;

    @FXML private TextField studentName;

    public FXMLExampleController() {
        this.sessionFactory = HibernateUtil.getSessionFactory();

    }

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {

        String studentNameStr = studentName.getCharacters().toString();
        String sthFunnyStr = sthFunnyIdField.getCharacters().toString();

        String target = new StringBuilder()
                .append("examples.Student name is: ")
                .append(studentNameStr)
                .append("\nSomething funny is:")
                .append(sthFunnyStr)
                .append("\n").toString();

        actiontarget.setText(target);


        Student student = new Student(studentNameStr, sthFunnyStr);

        try {
            this.startDatabaseConnection();
            session.save(student);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.finishDatabaseConnection();
        }


        System.out.println("Hello, I am pressed");

    }

    @FXML
    protected void closeApplication(ActionEvent event) {
        System.out.println("Exit from application.");
        Platform.exit();
        System.exit(0);
    }

    protected void startDatabaseConnection() {
        this.session = this.sessionFactory.openSession();
        this.transaction = session.beginTransaction();
    }

    protected void finishDatabaseConnection(){
        this.transaction.commit();
        this.session.close();
    }

    protected SessionFactory sessionFactory;
    protected Session session;
    protected Transaction transaction;



}