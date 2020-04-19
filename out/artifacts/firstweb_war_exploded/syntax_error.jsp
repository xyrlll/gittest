<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/19
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page errorPage="exception.jsp" %>

<%
    Calendar rightNow = null;

    //下行代码将产生NullPointerException异常
    rightNow.getTime();
%>
