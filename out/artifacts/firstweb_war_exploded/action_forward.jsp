<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/19
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head><title>Forward Test</title></head>
<body>
<jsp:forward page="forwardTo.jsp">
    <jsp:param name="userName" value="Hacker"/>
</jsp:forward>
</body>
</html>
