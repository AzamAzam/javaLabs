import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {


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
        String  exp=request.getParameter("exp");
         if (uname.equals(htmluname) && htmlpass.equals(pswd)) {
            if(ispalindrom(exp)){
                out.println("This expression \" "+exp+ " \" is palindrome");
            }
            else {
                out.println("This expression \" "+exp+ " \" is Not a palindrome");
            }
        } else {
            out.println("You have entered wrong username or password");
        }

    }

    public boolean ispalindrom(String s) {
        int  l=s.length();
        for (int  i=0;i<l/2;i++){
            if (s.charAt(i)!=s.charAt(l-i-1))
                return false ;
        }
        return true;
    }
}
