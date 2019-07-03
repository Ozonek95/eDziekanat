package com.kacpiegzamin.persistence;

import com.kacpiegzamin.model.Student;
import com.kacpiegzamin.model.StudentDoktorancki;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class MySQLConnector {
    private static SessionFactory sessionFactory;

    static SessionFactory getSessionFactory() {
        if(sessionFactory == null){
            try {
                Configuration configuration = new Configuration();
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/dziekanat?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "root");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.HBM2DDL_AUTO, "create-drop");
                configuration.setProperties(settings);
//            TODO Add entities classes here
                configuration.addAnnotatedClass(Student.class).
                addAnnotatedClass(StudentDoktorancki.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            return sessionFactory;
        }
        return sessionFactory;
    }
}
