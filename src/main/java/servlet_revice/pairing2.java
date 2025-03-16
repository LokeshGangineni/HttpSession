package servlet_revice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loki")
public class pairing2 extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs= req.getSession();
		String email1=(String)hs.getAttribute("emailkey");
		String name1=(String)hs.getAttribute("namekey");
		System.out.println(name1+"     "+email1);
		
		RequestDispatcher rd= req.getRequestDispatcher("index.jsp");
		rd.forward(req, resp);
	}

}
