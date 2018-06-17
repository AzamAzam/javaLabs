<%@ page import="Entity.Contact" %><%--
  Created by IntelliJ IDEA.
  User: DeskTop
  Date: 21-Jan-18
  Time: 09:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lab13</title>
</head>
<body>
<h4>Welcome <%=((Contact) session.getAttribute("contact")).getUname()%>
</h4>

<a href="ContactShow.jsp">Dsiplay Contact</a>
</body>
</html>
