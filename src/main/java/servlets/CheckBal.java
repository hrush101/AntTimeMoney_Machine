package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import operation.Check;

/**
 * Servlet implementation class CheckBal
 */
@WebServlet("/check")
public class CheckBal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBal() {
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
		Check c=new Check();
		String res=c.get_bal(request);
		
		HttpSession session=request.getSession();
		String accno=(String) session.getAttribute("name");
		
		request.setAttribute("result",res);
		request.setAttribute("account_no", accno);
		RequestDispatcher rd= request.getRequestDispatcher("balance.jsp");
		rd.forward(request, response);
		//response.sendRedirect("balance.jsp");
		doGet(request, response);
		
	}

}
