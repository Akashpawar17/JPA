package com.capgemini.HIBERNATE;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.capgemini.bean.Alien;
import com.capgemini.bean.AlienName;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   AlienName an = new AlienName();
   an.setFname("pawar");
   an.setLname("akash");
   an.setMname("abd");
   
        Alien a = new Alien();
       a.setAid(101);
       
       a.setTech("kaja");
       a.setAname(an);
       Configuration con =new Configuration().configure().addAnnotatedClass(Alien.class);
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(a);
        //a=(Alien) session.get(Alien.class, 103);
    
        tx.commit();
        System.out.println(a);
    }
}
