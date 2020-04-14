package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse
            response)
            throws ServletException, IOException {
        Student st=(Student)request.getAttribute("st");
        response.setContentType("text/html;charset= UTF-8");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<head>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h3> 学号： "+st.getSno()+"</h3><p>");
        pw.println("<h3> 姓名： "+st.getName()+"</h3><p>");
        pw.println("<a href=\"http://localhost:8080/hello/input4.html\"> 返回 </a>");
        pw.println("</body>");
        pw.println("</html>");
    }
}