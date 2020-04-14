package cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SendCookie extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {

        Cookie userCookie = new Cookie("user", "uid1234");
        userCookie.setMaxAge(60*60*24*7);
        response.addCookie(userCookie);

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        out.println("<html><title>add cookies</title>");
        out.println("<body><h2>"+"A cookie has been sent to brower</h2></body>");
        out.println("</html>");
    }
}
