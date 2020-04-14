package servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


    public class FirstServlet extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
        }

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //接受到表单的数据， 先使用request设置服务器应该使用的字符编码,否则字符不统一会出现乱码
            request.setCharacterEncoding("UTF-8");
            //获取请求的数据
            Student student = new Student();
            String name = request.getParameter("name");
            String sno = request.getParameter("sno");
            student.setSno(sno);
            student.setName(name);
            request.getSession().setAttribute("sno",student.getSno());
            request.getSession().setAttribute("name",student.getName());
            request.getRequestDispatcher("second").forward(request,response);

        }
    }
