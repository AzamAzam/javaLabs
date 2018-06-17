package Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DltCookie")
public class DltCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        Cookie ck[] = request.getCookies();

        if (ck != null) {
            for (int i = 0; i < ck.length; i++) {
                String cookieName = ck[i].getName();
                String cookiePass = ck[i].getValue();
                ck[i].setMaxAge(0);
                response.addCookie(ck[i]);

                out.print("<br> Cookie Name: " + cookieName + " Cookie Value: " + cookiePass + "deleted.");
            }
        }
        out.close();
    }
}

