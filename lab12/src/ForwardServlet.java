import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ForwardServlet")
public class ForwardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String flag = (String) (request.getAttribute("islogin"));
        PrintWriter out = response.getWriter();
        if (flag.equals("true")) {
            out.print("WelCome " + request.getParameter("uname"));
        } else {
            out.println("           <!DOCTYPE html>");
            out.println("You have entered wrong username or password");
            out.println("<html lang='en'>" +

                    "<form method='post' action='/validation'>" +
                    " <label>User Name</label><br><input type='text' name='uname'><br>" +
                    "<label>Password</label><br><input type='password' name='pswd'><br>" +


                    "<input type='submit'>" +
                    "</form>");
        }
    }
}
