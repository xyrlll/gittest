<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/19
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@ page errorPage="errorHandler.jsp" %>
<html>
<body>
<%
    String name = request.getParameter("name");
    if (name == null){
        throw new RuntimeException("没有指定name 属性。");
    }
%>
Hello, <%= name %>
</body>
</html>
