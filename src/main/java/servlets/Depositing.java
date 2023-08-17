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

import operation.Deposit;
import operation.Withdraw;

/**
 * Servlet implementation class Deposit
 */
@WebServlet("/depos")
public class Depositing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Depositing() {
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
		String amount = request.getParameter("deposit");

		
		
		HttpSession session=request.getSession();
		String account_no=(String) session.getAttribute("name");
		
		Date d1=new Date();
		
		Deposit d = new Deposit();
		int status=d.deposit_amount(amount, request);
		
		if(status==1) {
			
			request.setAttribute("acc_no", account_no);
			request.setAttribute("amt",amount);
			request.setAttribute("type","Deposit");
			request.setAttribute("date", d1);
			
			RequestDispatcher rd=request.getRequestDispatcher("receipt.jsp");
			rd.forward(request, response);
			
		}
		
		doGet(request, response);
	}

}
