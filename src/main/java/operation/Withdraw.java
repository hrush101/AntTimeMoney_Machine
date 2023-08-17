package operation;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import config.Config;
import user.Userdetail;

public class Withdraw {

	
	private Config config=new Config();	
	private SessionFactory sf=config.Conn();
	
	String withdrawal_balance(String am,String acc) {
		Session s=sf.openSession();
		Query q=s.createQuery("from Userdetail where accno=:acc");
		q.setString("acc",acc);
		
		
		Userdetail u=(Userdetail) q.uniqueResult();		
		//<----double bal= (double) q.getSingleResult();
		Double amount=Double.parseDouble(am);
		double w_money=(u.getBalance())-amount;
		String w_amount=Double.toString(w_money);
		s.close();
		return w_amount;
	}

	
	public int witthdraw_money(String amount,HttpServletRequest request) {
		
		HttpSession session=request.getSession();
		String acc=(String) session.getAttribute("name");
		Session s=sf.openSession();
		Withdraw w=new Withdraw();
		Transaction tr=s.beginTransaction();
		String hq="update Userdetail set balance=:w_bal where accno=:acc";
		Query q=s.createQuery(hq);
		q.setString("w_bal",w.withdrawal_balance(amount,acc));
		q.setString("acc",acc);
		int status=q.executeUpdate();
		 
		tr.commit();
		s.close();
		return status;
		
	}

}
