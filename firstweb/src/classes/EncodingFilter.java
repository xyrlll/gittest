package classes;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;
//@WebFilter(filterName = "CharacterFilter",urlPatterns = "/*",initParams = {@WebInitParam(name="encoding",value = "utf-8")})

public class EncodingFilter implements Filter {//实现filter接口
    //字符编码
    private String encoding;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //获取初始化参数
        encoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (encoding!=null) {
            //设置request字符编码
            servletRequest.setCharacterEncoding(encoding);
            //设置response字符编码
            servletResponse.setContentType("text/html;charset="+encoding);
        }
        //传递给下一个过滤器
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        encoding=null;
    }
}
