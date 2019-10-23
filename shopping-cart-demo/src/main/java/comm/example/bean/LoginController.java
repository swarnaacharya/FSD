package comm.example.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/LoginController", "/login.do" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request,
	         HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      String un = request.getParameter("uname");
	      String pwd = request.getParameter("pass");
	      if (un.equals("swarna")) {
	         out.print("Welcome, " + un);
	         HttpSession session = request.getSession(true); // reuse existing
	                                             // session if exist
	                                             // or create one
	         session.setAttribute("user", un);
	         session.setMaxInactiveInterval(30); // 30 seconds
	         response.sendRedirect("home.jsp");
	      } 
	      else 
	      {
	         RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
	        
	         rd.include(request, response);
	      } // TODO Auto-generated method stub
	   }
}
