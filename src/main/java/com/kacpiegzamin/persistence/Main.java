package com.kacpiegzamin.persistence;

import com.kacpiegzamin.model.StudentDoktorancki;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = MySQLConnector.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.save(new StudentDoktorancki("Kacper","Staszek"));
    }
}
