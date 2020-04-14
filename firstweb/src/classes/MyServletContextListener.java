package classes;

import com.sun.jdi.Value;

import javax.servlet.*;
import java.util.Date;

public final class MyServletContextListener
        implements ServletContextListener, ServletContextAttributeListener {

    private ServletContext context = null;
    public void contextInitialized(ServletContextEvent sce){
        System.out.println("应用程序启动时间：" + new Date());
    }
    public void contextDestroyed(ServletContextEvent sce){
        System.out.println("应用程序关闭时间：" + new Date());
    }
    public void attributeAdded(ServletContextAttributeEvent scae){
        System.out.println("添加了一个上下文属性："+
                scae.getName() + "=" + scae.getValue());
    }
    public void attributeRemoved(ServletContextAttributeEvent scae){
        System.out.println("删除了一个上下文属性："+
                scae.getName() + "=" + scae.getValue());
    }
    public void attributeReplaced(ServletContextAttributeEvent scae){
       String name = scae.getName();
       String value = (String) scae.getValue();
       System.out.println("修改属性"+name+": "+value);
    }
}
