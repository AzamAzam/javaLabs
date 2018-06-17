import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Myservlet")
public class Myservlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        //  out.println(request.getParameter("a"));
        ServletConfig servletConfig = getServletConfig();
        String uname = servletConfig.getInitParameter("UsrName");
        String pswd = servletConfig.getInitParameter("passwd");

        String htmluname = request.getParameter("uname");
        String htmlpass = request.getParameter("pswd");

        if (uname.equals(htmluname) && htmlpass.equals(pswd)) {
            request.setAttribute("islogin", "true");

        } else {
            request.setAttribute("islogin", "false");

        }
        ServletContext context = getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher("/forward");
        dispatcher.forward(request, response);
    }


}
