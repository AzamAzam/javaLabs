<%@ page import="Entity.Contact" %><%--
  Created by IntelliJ IDEA.
  User: DeskTop
  Date: 21-Jan-18
  Time: 05:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lab13</title>
</head>
<body>
<table>
    <thead>
    <th>Name</th>
    <th>Mobile</th>
    <th>Email</th>
    <th>Login Name</th>
    </thead>
    <%
        Contact contact = (Contact) session.getAttribute("contact");
        out.print("<tr>");
        out.print("<td>" + contact.getFname() + contact.getLname() + "</td>");
        out.print("<td>" + contact.getMobile()+"</td>");
        out.print("<td>" + contact.getEmail()+"</td>");
        out.print("<td>" + contact.getUname()+"</td>");
        out.print("</tr>");

    %>
</table>

</body>
</html>
