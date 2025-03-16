package servlet_revice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/lokesh")
public  class Pairing extends HttpServlet {

	

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		System.out.println(name+"  "+email);
		
		HttpSession hs= req.getSession();
		hs.setAttribute("emailkey", email);
		hs.setAttribute("namekey", name);
		
		RequestDispatcher rd= req.getRequestDispatcher("test.jsp");
		rd.forward(req, arg1);
		
	}
	

}
