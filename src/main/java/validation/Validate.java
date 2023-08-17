package validation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import config.Config;

import user.Userdetail;

public class Validate {

	public boolean verfiy(String uname, String pass) {
		
		Config config=new Config();	
		SessionFactory sf=config.Conn();
		Session s=sf.openSession();
		
	
		String hql="from Userdetail where accno=:acc and pass=:password";
		Query q=s.createQuery(hql);
		q.setString("acc",uname);
		q.setString("password",pass);
		
		Userdetail a1=(Userdetail) q.uniqueResult();//<--return a single instance or object that matches the query, or null if the query returns no results.
		
		
		
		if(a1!=null) {
			return true;
		}
		s.close();
		return false;
	}

}
