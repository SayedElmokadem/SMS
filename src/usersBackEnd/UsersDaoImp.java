package usersBackEnd;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import smsConfig.SmsConfiguration;

public class UsersDaoImp implements UsersDao {
	SmsConfiguration config=null;

	public UsersDaoImp() {
	 config=new SmsConfiguration();
		
	}

	@Override
	public List<UsersEntity> getAllUsers() {
		List<UsersEntity>	users=null;
		try{
		Session session = config.getSession();
		session.getTransaction().begin();
	     Query query=session.createQuery("select u from UsersEntity");	
	  	users=query.getResultList();	
		}catch (HibernateException e) {
			System.out.println(e.getMessage());
		}	
		return users;
	}

	@Override
	public UsersEntity getUserById(long id) {
		UsersEntity user=null;
		try{
			Session session = config.getSession();
			session.getTransaction().begin();
		    user= session.get(UsersEntity.class, id);
			}catch (HibernateException e) {
				System.out.println(e.getMessage());
			}	
			return user;
	}

	@Override
	public UsersEntity getUserByName(String username) {
		UsersEntity	user=null;
		try{
		Session session = config.getSession();
		session.getTransaction().begin();
	     Query query=session.createQuery("select u from UsersEntity u  where u.Name='"+username+"'");	
	  	user=(UsersEntity) query.getResultList().get(0);	
		}catch (HibernateException e) {
			System.out.println(e.getMessage());
		}	
		return user;
	}

	@Override
	public String updateUser(UsersEntity user) {
		try{
			Session session = config.getSession();
			session.getTransaction().begin();
		      session.update(user);
			}catch (HibernateException e) {
				System.out.println(e.getMessage());
			}	
			return "update successfully";
	}

	@Override
	public String deleteUser(UsersEntity user) {
		try{
			Session session = config.getSession();
			session.getTransaction().begin();
		      session.delete(user);
			}catch (HibernateException e) {
				System.out.println(e.getMessage());
			}	
			return "delete successfully";
	}

	@Override
	public UsersEntity addUser(UsersEntity user) {
		try{
		Session session = config.getSession();
		session.getTransaction().begin();
	      session.save(user);
		}catch (HibernateException e) {
			System.out.println(e.getMessage());
		}	
		return user;
	}

}
