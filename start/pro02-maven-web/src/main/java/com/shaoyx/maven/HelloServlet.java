package com.shaoyx.maven;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

import com.shaoyx.maven.HelloServlet;

/*测试方式：
 * 通过import语句将要测试的类引入当前类，引入后：
 * 编译通过：可以使用，这个范围的依赖对当前类有效
 * 编译失败：不能使用，这个范围的依赖对当前类无效
 *
 *  */


/**
 * @author SYX
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().write("<h1>hello maven web</h1>");


    }

}