<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/19
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page session="true" %>
<%
    session.setAttribute("user","璃陌");
%>

<html>
<body>
您的会话ID是：<%=session.getId()%><br>
session对象中存放的变量user的值为：<%=session.getAttribute("user")%>
</body>
</html>
