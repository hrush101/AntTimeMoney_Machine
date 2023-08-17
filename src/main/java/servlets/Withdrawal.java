package servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import operation.Withdraw;

/**
 * Servlet implementation class Withdrawal
 */
@WebServlet("/wd")
public class Withdrawal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Withdrawal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String amount=request.getParameter("withdraw");
		
		HttpSession session=request.getSession();
		String account_no=(String) session.getAttribute("name");
		
		Date d=new Date();
		
	    Withdraw w=new Withdraw();
		int status=w.witthdraw_money(amount, request);
		if(status==1) {
			
			request.setAttribute("acc_no", account_no);
			request.setAttribute("amt",amount);
			request.setAttribute("type","Withdraw");
			request.setAttribute("date", d);
			RequestDispatcher rd=request.getRequestDispatcher("receipt.jsp");
			rd.forward(request, response);
			
		}
		
		doGet(request, response);
	}

}
