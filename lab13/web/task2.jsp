<%@ page import="DAO.CitiesDAO" %>
<%@ page import="Entity.Cities" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: DeskTop
  Date: 22-Jan-18
  Time: 07:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab13 Task2 </title>

</head>
<body>

<form method="post" action="">
    <table>
        <tr>
            <td>
                <label>Name</label>
            </td>
            <td>
                <input type="text" name="name"
                       value=<%=(request.getMethod()).equalsIgnoreCase("POST")?request.getParameter("name"):" "%>><br/>
            </td>
        </tr>
        <tr>
            <td><label>province</label>
            </td>
            <%--    <td><select onchange="this.form.submit()" name="province">
               --%>
            <td><select onchange="this.form.submit()" name="province" value="Select">
                <%
                    String[] province = {" ", "Punjab", "Sindh", "KPK", "Baluchistan"};
                    for (String str : province) {
                        out.print("<option");
                        if ((request.getMethod()).equalsIgnoreCase("POST") && request.getParameter("province").equals(str))
                            out.print(" selected");
                        out.println(">" + str + "</option>");
                    }%>

            </select>
            </td>
        </tr>
    </table>

</form>
<%
  //  out.print(request.getMethod());
    if (request.getMethod().equals("POST")) {
        out.print("<h1> The Cities Are : </h1> ");
        ArrayList<Cities> list = (new CitiesDAO().readData(request.getParameter("province")));
        out.println("<select>");
        for (Cities city : list) {
            out.println("<option>" + city.getCity() + "</option>");
        }
        out.println("</select>");
    }

%>
</body>
</html>
