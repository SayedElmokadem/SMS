package smsConfig;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import usersBackEnd.UsersEntity;

public class SmsConfiguration {

	private SessionFactory sf = null;
	private Session session = null;

	public SmsConfiguration() {
		try {
			sf = new Configuration().configure().addAnnotatedClass(UsersEntity.class).buildSessionFactory();
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		}
	}

	public Session getSession() {
		try {
			session = sf.getCurrentSession();
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		}
		return session;
	}

	public void SessionClose() {
		session.close();
	}

}
