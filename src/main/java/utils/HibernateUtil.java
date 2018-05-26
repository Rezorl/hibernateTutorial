package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	private static SessionFactory buildSessionFactory() {
        try {
            SessionFactory sessionFactory = new Configuration()
    		        .configure() // configures settings from hibernate.cfg.xml
    		        .buildSessionFactory();
            return sessionFactory;
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

	public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) sessionFactory = buildSessionFactory();
        return sessionFactory;
    }
	
}
