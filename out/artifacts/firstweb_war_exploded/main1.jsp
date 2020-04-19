<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/19
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>New Century Web Bookstore</title></head>
<body bgcolor="#FFFFFF">
<jsp:include page="header.htmlf" flush="true"/>
<table border=0 cellspacing=5 cellpadding=5 width="100%">
    <tr><td>
        <p align="center"><b>欢迎光临新世纪网上书店！</b></p>
    </td>
    </tr>
    <tr>
        <td>
            <p align="center"><b>
                <a href="/bookstore/catalog">开始购买图书</a></b>
        </td>
    </tr>
</table>
<jsp:include page="footer.jspf" flush="true"/>
</body>
</html>
