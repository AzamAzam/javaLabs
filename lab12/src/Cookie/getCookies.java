package Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "getCookies")
public class getCookies extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        Cookie ck[]=request.getCookies();

        if(ck != null)
        {
            for(int i=0;i<ck.length;i++)
            {
                out.print("<br> Cookie Name: " + ck[i].getName()+" Cookie Value: "+ck[i].getValue());
            }
        }
        out.println("<form action='/dltCookie' method='post'><button  type='submit'>Delete Cookie</button></form>");

        out.close();
    }

}
