import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet")
public class CalculateServlet extends HttpServlet {
    int rate=5;



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int q = Integer.parseInt(request.getParameter("quantity"));
        PrintWriter out=response.getWriter();
        out.print("<h6>Price  of  good   having  quantity \" "+ q+ " \" is  "+(q*rate) + "</h6>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
