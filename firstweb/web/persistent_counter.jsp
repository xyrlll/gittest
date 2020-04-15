<%--
  Created by IntelliJ IDEA.
  User: 81224
  Date: 2020/4/15
  Time: 1:56
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" import="java.io.*" %>
<%!
    int count = 0;
    String dbPath;
    public void jspInit(){
        try{
            dbPath = getServletContext().getRealPath("/WEB-INF/counter.db");
            FileInputStream fis = new FileInputStream(dbPath);
            DataInputStream dis = new DataInputStream(fis);
            count = dis.readInt();
            dis.close();
        }catch(Exception e){
            log("Error loading persistent counter", e);
        }
    }
%>
<%-- 下面是向浏览器输出的主要内容，
它将成为产生的 _jspService() 方法的一部分
--%>
<html><body>
<% count++; %>
Welcome! You are <%= count %>th visitor(s).
</body></html>
<%!
    public void jspDestroy(){
        try{
            FileOutputStream fos = new FileOutputStream(dbPath);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(count);
            dos.close();
        }catch(Exception e){
            log("Error storing persistent counter", e);
        }
    }
%>