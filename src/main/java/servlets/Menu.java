package servlets;

import java.io.IOException;
import java.net.ResponseCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/menu")
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String option=request.getParameter("button");
		
		
		if(option.equals("withdraw")) {
			response.sendRedirect("withdrawal.jsp");
			//RequestDispatcher rd=request.getRequestDispatcher("withdrawal.jsp");
		}
		if(option.equals("deposit")){
			response.sendRedirect("deposit.jsp");
			//RequestDispatcher rd=request.getRequestDispatcher("deposit.jsp");
		}
		if(option.equals("check")){
			response.sendRedirect("check.jsp");
			//RequestDispatcher rd=request.getRequestDispatcher("check.jsp");
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
