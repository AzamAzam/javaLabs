<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: DeskTop
  Date: 30-Jan-18
  Time: 08:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% if (exception instanceof SQLException) {
%>
SQl Exception
<% } else if  (exception instanceof ClassNotFoundException) {%> Clas  not  found   <% }%>
</body>
</html>
