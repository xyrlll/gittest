package classes;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public final class MyRequestListener
        implements ServletRequestListener{
    private int count = 0;
    public void requestInitialized(ServletRequestEvent re){
        HttpServletRequest request=
                (HttpServletRequest)re.getServletRequest();
        if(request.getRequestURI().equals("/hello/rqlistener_test.jsp")){
            count++;
            re.getServletContext().setAttribute("count",new Integer(count));
        }
    }
    public void requestDestroyed(ServletRequestEvent re){
    }
}