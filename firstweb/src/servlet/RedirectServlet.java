package servlet;


import javax.print.attribute.standard.RequestingUserName;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.util.StringTokenizer;

public class RedirectServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException {
        // 以下划线处需自行添加若干代码
         String username= request.getParameter("username");
         String password = request.getParameter("password");

        if( "admin".equals(username)&&"admin".equals(password)                            ){
            response.sendRedirect("welcome.jsp?username="+username                 );
        }else{
            response.sendRedirect( " error.jsp");
        }
    }
}