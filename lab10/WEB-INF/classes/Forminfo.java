
import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Forminfo extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3302099280405236531L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		FileWriter f=new FileWriter("D:/apache-tomcat-8.5.24/webapps/lab10/info.txt",true);
		
		String fName = req.getParameter("fname");
		String lName = req.getParameter("lname");
		String dob = req.getParameter("DOB");
		String gender  = req.getParameter("gender");
		String email = req.getParameter("email");
		
		f.write(fName+"\t"+lName+"\t"+dob+"\t"+gender+"\t"+email+"\n");
		f.close();
		
		
		
		
		PrintWriter  out=res.getWriter();
		out.print("<html>"+
                "<body>"+
                    "<h1 >" +
                       "Info Stored"+
                    "</h1>");
					
		out.print("</body></html>");

		
		
		out.close();

		
	}

}
