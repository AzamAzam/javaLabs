
import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Searchinfo extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3302099280405236531L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//	FileReader f=new FileReader("D:/info.txt");
		BufferedReader file=new BufferedReader(new FileReader("D:/apache-tomcat-8.5.24/webapps/lab10/info.txt"));
		String fName = req.getParameter("fname");
/*		String lName = req.getParameter("lname");
		String dob = req.getParameter("DOB");
		String gender  = req.getParameter("gender");
		String email = req.getParameter("email");
		
		f.write(fName+"\t"+lName+"\t"+dob+"\t"+gender+"\t"+email+"\n");
*/	
	
		PrintWriter  out=res.getWriter();
		out.print("<html>"+
                "<body>"+
                    "<h1 >" +
                       "Info fetched from file"+
                    "</h1>");
		String s;
		boolean  flag=false ;
		while((s=file.readLine())!=null){
		String arr[]=s.split("\t");
		
		if (arr[0].equals(fName))
		{
			if (!flag)
		out.print("<table border='2'><tr><th>First Name</th><th>Last Name</th><th>DOB</th><th>Gender</th><th>Email</th></tr>");			
	
		out.print("<tr><td>"+arr[0]+"</td><td>"+arr[1]+"</td><td>"+arr[2]+"</td><td>"+arr[3]+"</td><td>"+arr[4]+"</td></tr>");		
		flag=true;
		}
		
		
		}
		
		if (!flag){
			out.print("Info Not Found ");
		}
		else  
			out.print("</table");
		out.print("</body></html>");		
		file.close();
		out.close();

		
	}

}
