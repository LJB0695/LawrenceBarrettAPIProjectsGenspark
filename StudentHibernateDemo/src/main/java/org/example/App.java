package org.example;

import org.example.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

//        Student s1 = new Student();
//        s1.setStudentID(1);
//        s1.setName("Phillip");
//        s1.setFavoriteClass("Math");
//        session.save(s1);
//        Student s2 = new Student();
//        s2.setStudentID(2);
//        s2.setName("Bobby");
//        s2.setFavoriteClass("AP Gov");
//        session.save(s2);


        Query query = session.createQuery("from Student");
        List<Student> listStudent = query.list();

        for (Student student:listStudent) {
            System.out.println(student.toString());
        }



        t.commit();
        System.out.println("Retrieved successfully");
        session.close();
        factory.close();

    }
}
