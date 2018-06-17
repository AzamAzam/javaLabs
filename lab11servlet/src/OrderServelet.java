import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrderServelet")
public class OrderServelet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>" +
                "<html lang='en'>" +
                "<head>" +

                "   <title>Title</title>" +
                "</head>" +
                "<body>" +
                "<h6> Order Servlet</h6>");

        out.flush();

        ServletContext context=getServletContext();
        RequestDispatcher dispatcher=context.getRequestDispatcher("/calculate");
        dispatcher.include(request,response);

        out.print("<br>End of  Order ");
        out.print("</body></html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
