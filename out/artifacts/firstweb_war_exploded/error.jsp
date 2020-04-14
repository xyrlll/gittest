<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/8
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My JSP 'error.jsp' starting page</title>
</head>

<body>
请重新登陆！
<%
    //response.sendRedirect("/login.htm");本行运行时会有什么问题？
    response.sendRedirect("/hello/login.html");
%>
</body>

</body>
</html>
