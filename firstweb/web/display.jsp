<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/19
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="classes.UserBean" %>
<jsp:useBean id="user" class="classes.UserBean" scope="session"/>
<jsp:setProperty name="user" property="*"/>
<html>
<body>
UserName:<jsp:getProperty name="user" property="username"/><br>
Password:<jsp:getProperty name="user" property="password"/><br>
Email:   <jsp:getProperty name="user" property="email"/><br>
</body>
</html>