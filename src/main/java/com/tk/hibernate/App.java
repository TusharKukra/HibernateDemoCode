package com.tk.hibernate;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tk.hibernate.entity.Student;
import com.tk.hibernate.entity.StudentName;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Demo" );
        
        Student s1 = new Student();
       
        s1.setSid(102);
        
        // Now as we create a Custom Class for name variable, we have to use its object
        StudentName sname = new StudentName();
        sname.setFirstName("T");
        sname.setLastName("K");
        
        // Now put the StudentName in Student Object
        
        s1.setSname(sname);
        s1.setSclass("CSE");

        
        // In jdbc : we write import statements, queries etc....
        
        // But in Hibernate : we just have to use save(s1) method
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        
        
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        // Create a transaction before saving the object into Database
        
        Transaction tx = session.beginTransaction();
        
        //session.save(s1);  // (do comment, to fetch the values using toString method)
        
        // to fetch using a particular value: 
        s1 = (Student) session.get(Student.class, 101);
        
        tx.commit();
        
        System.out.println(s1);
        
    }
}
