<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/19
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    int number = 0;
    Integer num =(Integer)application.getAttribute("num");
    if(num==null){
        application.setAttribute("num",new Integer(number));
    }
    else{
        number = num.intValue()+1;
        application.setAttribute("num",new Integer(number));
    }
%>
<html><head><title>application example</title></head>
<body>
<center><font color="#0000ff" size="5">application对象示例</font>
</center>
<hr>
本页面文件的实际路径是：<br><%=application.getRealPath("application.jsp") %><br>
application对象中变量num的值为：<%=application.getAttribute("num") %>
</body>
</html>
