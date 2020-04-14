<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/12
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Listener test</title>
</head>
<body>
欢迎您，您的IP地址是<%= request.getRemoteAddr() %>
<p>自应用程序启动以来，该页面被访问了
    <span style="color: blue; "><%=application.getAttribute("count")%>
    </span>次<br>
</body>
</html>
