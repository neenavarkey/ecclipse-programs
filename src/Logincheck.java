import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Logincheck")
public class Logincheck extends HttpServlet 
{
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
		String uname=request.getParameter("uname");
		String passwd=request.getParameter("passwd");
		model.Logincredential obj=new model.Logincredential();
		obj.setUname(uname);
		obj.setPasswd(passwd);
		if(obj.checkLogin())
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("success.jsp");
			dispatch.forward(request, response);
		}
			else
			{
				
				RequestDispatcher dispatch=request.getRequestDispatcher("failure.jsp");
				dispatch.forward(request, response);	
			
		}
	}

}
