
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Color extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3302099280405236531L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String c = req.getParameter("ClrFld");
		
		PrintWriter  out=res.getWriter();
		out.print("<html>"+
                "<body>"+
                    "<h1 style='color:"+c+"'>" +
                       "hello World "+
                    "</h1>");
					
		out.print("</body></html>");

		
		
		out.close();
	}

}
