<%@ page import="DAO.ContactDAO" %>

<%--
  Created by IntelliJ IDEA.
  User: DeskTop
  Date: 21-Jan-18
  Time: 06:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lab13</title>
</head>
<body>

<% // check  remaning  if  user already exists

    if (request.getMethod().equals("POST")) {
%>
<jsp:useBean id="contact" class="Entity.Contact" scope="page"/>
<jsp:setProperty name="contact" property="*"/>
<%
        /*
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String uname = request.getParameter("uname");
        String pasword = request.getParameter("pswd");

        Contact contact = new Contact(fname, lname, mobile, email, uname, pasword);*/
        new ContactDAO().InsertData(contact);
        //   out.println("Added");
           response.sendRedirect("index.jsp");

    }
%>
<form method="post" action="">
    <fieldset>
        <legend>Sign UP</legend>
        <table>
            <tr>
                <td> First Name</td>
                <td><input type="text" name="fname"></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="lname"></td>
            </tr>
            <td>Mobile</td>
            <td><input type="text" name="mobile" pattern="[0-9]*"></td>
            <tr>
                <td>Email</td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <td> Password</td>
                <td><input type="password" name="password" required></td>
            </tr>
            <tr>
                <td> Login Name</td>
                <td><input type="text" name="uname" required></td>
            </tr>
            <tr>
                <td><input type="submit"></td>

            </tr>


        </table>
    </fieldset>
</form>
</body>
</html>
