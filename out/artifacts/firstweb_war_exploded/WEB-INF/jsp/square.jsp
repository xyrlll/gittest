<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/6
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><body>
<table border=’1’ cellspacing=’0’ cellpadding=’5’>
    <tr><th>number</th><th>squared</th></tr>
    <% for ( int i=0; i<10; i++ ) { %>
    <tr><td><%= i %></td><td><%= (i * i) %></td></tr>
    <% } %>
</table>
</body></html>
