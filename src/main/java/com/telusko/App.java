package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Alience kau=new Alience();
        kau.setAid(101);
        kau.setAname("Deb");
        kau.setAcolour("black");
        Configuration con=new Configuration().configure();
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        session.save(kau);
    }
}
