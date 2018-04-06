package success.FXController;

import examples.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainPanelView {
    public MainPanelView() {
        this.sessionFactory = HibernateUtil.getSessionFactory();

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
