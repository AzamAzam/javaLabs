<%@ page import="DAO.ContactDAO" %>
<%//@ page  import="Entity.Contact" %>
<jsp:directive.page import="Entity.Contact"/>
<%--
  Created by IntelliJ IDEA.
  User: DeskTop
  Date: 21-Jan-18
  Time: 08:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lab13</title>

</head>
<body>


<%@include file="signUp.jsp"%>
<form method="post" action="index2.html" >
    <fieldset>
        <legend>SignIn</legend>
        <table>
            <tr>
                <td>User Name</td>
                <td><input type="text" name="uname" required></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" required></td>
            </tr>
            <tr>
                <td>
                    <button  type="submit">Login</button>

                </td>
                <td>
                    <button type="reset">Reset</button>
                </td>
            </tr>
        </table>
    </fieldset>
</form>

</body>
<%=request.getMethod()%>
<%
    if (request.getMethod().equals("POST")) {
        String uname = request.getParameter("uname");
        String password = request.getParameter("password");
        Contact contact = (new ContactDAO()).readDate(uname);
        String savedPaswd = contact.getPassword();
        if (savedPaswd.equals(password)) {
            session.setAttribute("contact", contact);

            //    response.sendRedirect("welcome.jsp");
            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.forward(request, response);

%>

<jsp:forward page="welcome.jsp"/>

<%
        } else {
            out.println("<p style='color:red;'>Username or Password  is Incorrect </p>");
            out.println("<form action='signUp.jsp'><input type='submit' value='Sign Up'/></form>");
        }
    }
%>

</html>
