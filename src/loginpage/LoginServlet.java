package loginpage;

import java.io.*;
import jakarta.*;
import jakarta.servlet.http.*;
import jakarta.servlet.*;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		String name = req.getParameter("userName");
		String pass = req.getParameter("userPassword");
		if(name.equals("jarvis") && pass.equals("jarvis")) 
			out.println("Successfully login");
		else
			out.println("username or password is incorrect");
		
		out.close();
	}
}
