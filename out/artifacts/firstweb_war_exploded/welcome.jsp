<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/8
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body> <head>
    <title>My JSP 'welcome.jsp' starting page</title>
</head>

<body>
<%
    String username = request.getParameter("username");
%>
<%=username %>,欢迎您登陆！
</body>

</body>
</html>
