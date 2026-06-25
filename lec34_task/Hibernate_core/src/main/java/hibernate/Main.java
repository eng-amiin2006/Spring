package hibernate;

import hibernate.model.Teacher;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration factory =
                new Configuration()
                        .addAnnotatedClass(Teacher.class)
                        .configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = factory.buildSessionFactory();
        System.out.println("Hibernate Connected");
        sessionFactory.close();
    }
}