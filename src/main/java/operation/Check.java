package operation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import config.Config;
import user.Userdetail;

public class Check {

	private Config config=new Config();	
	private SessionFactory sf=config.Conn();
	
	public String get_bal(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String acc =(String) session.getAttribute("name");
		Session s=sf.openSession();
		Query q=s.createQuery("from Userdetail where accno=:account");
		q.setString("account", acc);
		Userdetail u=(Userdetail) q.uniqueResult();
		double bal=u.getBalance();
		return Double.toString(bal);
		
	}

}
