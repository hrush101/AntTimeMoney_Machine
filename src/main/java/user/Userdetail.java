package user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userdetail {
	@Id
	private int sno;
	private long accno;
	private double balance;
	private int pass;
	private String account_name;
	
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Userdetail [sno=" + sno + ", accno=" + accno + ", balance=" + balance + ", pass=" + pass
				+ ", account_name=" + account_name + "]";
	}
	
	
	
	
	
	

	
}
