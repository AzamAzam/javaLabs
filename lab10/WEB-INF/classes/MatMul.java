import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MatMul extends HttpServlet
{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setHeader("Content-Disposition","inline; Matrix Multiplication");
        PrintWriter out = response.getWriter();
        out.print("<html>"+
                "<body>"+
                    "<h1>" +
                       "Matrix Multiplication"+
                    "</h1>");
        MatMultiplication(response);
    }

    // inline method for matrix multiplication
    public void MatMultiplication(HttpServletResponse response)
    {
        int A[][] = {{1,1,1,1}, {1, 1, 1},{2,2,2}};
        int B[][] = {{1, 1, 1}, {1, 1, 1},{1,1,1}};
        int C[][] = new int[3][3];

        try {
            PrintWriter out = response.getWriter();
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    for (int k = 0; k < 3; k++)
                        C[row][col] = C[row][col] + (A[row][k] * B[k][col]);
                }
            }

            for(int row = 0; row<3; row++)
            {
                out.print("<p>");
                for(int col =0; col<3; col++)
                {
                    out.print(" "+C[row][col]+" ");
                }
                out.print("</p>");
            }
            out.print("</body>" +
                    "</html>");

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
