<%--
  Created by IntelliJ IDEA.
  User: Reda
  Date: 13/10/2022
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Admin</title>
</head>
<body>
    <form name="Register_form" action="AdminServlet" method="post">
        <label>Nom : </label><br><br>
        <input required type="text" name="nom" placeholder="Enter le nom"><br><br>
        <label>Prenom : </label><br><br>
        <input required type="text" name="prenom" placeholder="Enter le prenom"><br><br>
        <label>Email : </label><br><br>
        <input required type="email" name="email" placeholder="Enter email"><br><br>
        <label>Mot de passe : </label><br><br>
        <input required type="password" name="password" placeholder="Enter le mot de passe"><br><br>
        <input type="submit" value="Submit" name="Register"><br><br>
        <a href="Views/index.jsp">Index</a>
        <span style="color: green; ">
            <%
                if (session.getAttribute("sm") != null) {
                    System.out.println(session.getAttribute("sm"));
                    session.setAttribute("sm", null);
                }
            %>
        </span>
        <span style="color: red; ">
            <%
                if (session.getAttribute("em") != null) {
                    System.out.println(session.getAttribute("em"));
                    session.setAttribute("em", null);
                }
            %>
        </span>
    </form>
</body>
</html>
