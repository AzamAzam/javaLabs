

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Lab11t1 extends HttpServlet {
    String usrname ;
    String passwd;

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */

  /*  public void init(ServletConfig config) throws ServletException {
		super.init(config);
		usrname = config.getInitParameter("username");
		passwd  =  config.getInitParameter("password");

	}*/
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        ServletConfig config=getServletConfig();
        usrname=config.getInitParameter("UsrName");
        passwd  =config.getInitParameter("passwd");

        String u_name=request.getParameter("username");
        String pwd= request.getParameter("pwd");
        String exp =request.getParameter("expr");
        PrintWriter out=response.getWriter();
  //      out.print(u_name+" "+usrname);
        if (usrname.equals(u_name) && passwd.equals(pwd))
        {
            int l=exp.length()-1;
            boolean flag=true;
            for (int i=0;i<l/2;i++)
            {
                if (exp.charAt(i)!= exp.charAt(l))
                {
                    flag =false;
                }


            }
            if (flag )
               out.print("Palindrom");
            else
                out.print("Not  a Palindrom");
          //  out.print("Usename and password are correct");
        }
        else

        {
            out.println("You have entered wrong username and password");


        }
    }




}
