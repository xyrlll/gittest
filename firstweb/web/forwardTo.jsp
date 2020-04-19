<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String userName = request.getParameter("userName");
    String welcomeStr = "欢迎光临本站";
    welcomeStr = userName+","+welcomeStr;
    out.print(welcomeStr);
%>