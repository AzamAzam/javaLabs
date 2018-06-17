<%--
  Created by IntelliJ IDEA.
  contact: DeskTop
  Date: 23-Jan-18
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page errorPage="error.jsp" %>
<html>
<head>
    <title>lab13</title>
</head>
<body>
<jsp:useBean id="contact" class="Entity.Contact" scope="session"/>
<jsp:setProperty name="contact" property="*"/>
<table border="1">
    <thead>
    <th>FName</th>
    <th>LName</th>
    <th>Mobile</th>
    <th>Email</th>
    <th>Login Name</th>
    </thead>
    <tr>
        <td>
            <jsp:getProperty name="contact" property="fname"/>

        </td>
        <td>
            <jsp:getProperty name="contact" property="lname"/>
        </td>
        <td>
            <jsp:getProperty name="contact" property="mobile"/>
        </td>
        <td>
            <jsp:getProperty name="contact" property="email"/>
        </td>
        <td>
            <jsp:getProperty name="contact" property="uname"/>
        </td>

    </tr>
</table>
</body>
</html>
