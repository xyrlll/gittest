<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/15
  Time: 1:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><body>
<%@ page language="java" %>
<%!
    int anInt = 3;
    boolean aBool = true;
    Integer anIntObj = new Integer(3);
    Float aFloatObj = new Float(8.6);
    String str = "some string";
    StringBuffer sBuff = new StringBuffer();
    char getChar(){ return 'A'; }
%>
<%= 500 %>
<%= anInt*3.5/100-500 %>
<%= aBool %>
<%= false %>
<%= !false %>
<%= getChar() %>
<%= Math.random() %>
<%= aFloatObj %>
<%= aFloatObj.floatValue() %>
<%= aFloatObj.toString() %>
<%= aBool %>
<%= 20%>
</body></html>
