package usersBackEnd;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SmsMainClass {

	public static void main(String[] args) {
		
SessionFactory sf=new Configuration().configure().addAnnotatedClass(UsersEntity.class).buildSessionFactory();	
		try{
		Session  session=sf.getCurrentSession();
		
		
		
		}catch (HibernateException e) {
			
			System.out.println(e.getMessage());
		}
		
		}
}
