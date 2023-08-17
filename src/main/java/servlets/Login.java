package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import operation.Withdraw;
import validation.Validate;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		
		
		Validate validate=new Validate();
		boolean arg=validate.verfiy(uname,pass);
		
		HttpSession session = request.getSession();
		session.setAttribute("name",uname);
		
		
		
		if(arg==true) {
			
			//System.out.println("login successful");
			RequestDispatcher rd= request.getRequestDispatcher("menu.jsp");
			rd.forward(request, response);
			
		}else {
			//System.out.println("invalid login");
			request.setAttribute("msg","invalid login");	
			RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		doGet(request, response);
	}

}
