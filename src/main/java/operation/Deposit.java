package operation;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import config.Config;
import user.Userdetail;

public class Deposit {
	private Config config=new Config();	
	private SessionFactory sf=config.Conn();

	String deposit_balance(String acc, String amount) {
		
		Session s=sf.openSession();
		Query q=s.createQuery("from Userdetail where accno=:account");
		q.setString("account",acc);
		Userdetail u=(Userdetail) q.uniqueResult();
		Double am=Double.parseDouble(amount);
		double d_bal=(u.getBalance())+am;
		String dp_bal=Double.toString(d_bal);
		s.close();
		return dp_bal;
	}
	public int deposit_amount(String amount,HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		String acc=(String)session.getAttribute("name");
		
		Deposit d=new Deposit();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		String hq="update Userdetail set balance=:bal where accno=:acno";
		Query q=s.createQuery(hq);
		q.setString("bal",d.deposit_balance(acc, amount));
		q.setString("acno",acc);
		int status=q.executeUpdate();
		
		tr.commit();
		s.close();
		return status;
	}
	

}
