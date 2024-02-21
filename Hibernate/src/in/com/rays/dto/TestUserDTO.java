package in.com.rays.dto;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUserDTO {

	public static void main(String[] args) {
		UserDTO user =new UserDTO();
		user.setId(2);
		user.setFirstName("ram");
		user.setLastName("sharma");
		user.setLoginId("ram@gmail.com");
		user.setPassword("12345");
		user.setDob (new Date());
		user.setAddress("pune");
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		
		tx.commit();
		session.close();
	}

}
