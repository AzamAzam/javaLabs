package Cookie;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Cookie.Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out =response.getWriter();
        ServletConfig servletConfig = getServletConfig();
        String uname = servletConfig.getInitParameter("UsrName");
        String pswd = servletConfig.getInitParameter("passwd");

        String htmluname = request.getParameter("uname");
        String htmlpass = request.getParameter("pswd");
        if (uname.equals(htmluname) && htmlpass.equals(pswd)) {
            Cookie userCk = new Cookie("user", htmluname);
            userCk.setMaxAge(6000);
            Cookie passCk = new Cookie("pass", htmlpass);
            passCk.setMaxAge(6000);

            response.addCookie(userCk);
            response.addCookie(passCk);

            out.println("<b>Cookies are created. Press Get Cookies Button to get Cookies</b>");
            out.println("<form action='/getCookie' method='post'><button  type='submit'>Get Cookie</button></form>");


        } else {
            out.println("Wrong username or password!!");
        }

        out.close();
    }


}
