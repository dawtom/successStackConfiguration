package examples;

import org.hibernate.SessionFactory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Student {

    public Student() {
    }

    @Id
    @GeneratedValue
    @Column(name = "shop_id")
    private Integer id;

    @Column(name = "changedName")
    private String name;


    @Column(name = "strFunny")
    private String fun;



    public Student(String name, String fun) {
        this.name = name;
        this.fun = fun;
    }
}
