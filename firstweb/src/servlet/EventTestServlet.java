package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EventTestServlet  extends HttpServlet {
    ServletContext context =null;

    public void init(ServletConfig config){
        context = config.getServletContext();
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        response.setHeader("Content-Type","text/html;charset=UTF-8");
      //  response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Event Test</title></head>");

        context.setAttribute("login","tom"); 	//添加属性
        context.setAttribute("login","john");  //替换属性
        context.removeAttribute("login"); 		//删除属性
        out.println("<h3 align=center>"+
                "已在ServletContext对象上添加、替换和删除了属性</h3>");
        out.println("</body></html>");
        out.close();
        out.close();
    }
}
