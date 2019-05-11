/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Bhuvnesh Sharma
 */
public class Userdao {
    public boolean check(Student orignal){
        Student db=null;
        Configuration cf=new Configuration();
        cf.configure("hibernate1.cfg.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        System.out.println(orignal.getUnm());
        db=(Student)session.get(Student.class,orignal.getUnm());
        session.save(orignal);
        tx.commit();
        session.close();
        sf.close();
        if(db==null){
            return false;
        
    }
        else{
            return orignal.equals(db);
}
    }
}
