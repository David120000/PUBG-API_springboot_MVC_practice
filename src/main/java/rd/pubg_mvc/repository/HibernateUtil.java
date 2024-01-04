package rd.pubg_mvc.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class HibernateUtil {
    
    private SessionFactory factory;
	

	public HibernateUtil() {	
		this.factory = (new Configuration()).configure().buildSessionFactory();
	}
	

	public Session getSession() {		
		return factory.openSession();
	}
}
