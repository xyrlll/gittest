package servlet;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet4 extends HttpServlet {
    ServletContext context;
    public void init(){
        context =getServletContext();

    }
    public  void  doPost(HttpServletRequest request,
                         HttpServletResponse response)
        throws ServletException,IOException{
        request.setCharacterEncoding("UTF-8");
        String sno = request.getParameter("sno");
        String name = request.getParameter("name");
        Student st =new Student(sno,name);
        request.setAttribute("st",st);
        RequestDispatcher view = request.getRequestDispatcher("/second4");
        view.forward(request, response);
    }

}
