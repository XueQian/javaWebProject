package com.thoughtworks.servlet;

import com.thoughtworks.service.ItemService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    private ItemService itemService = new ItemService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        response.setContentType("Text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        out.println("<html><body><center>Test<hr/></center></body></html>");
//        out.close();
        String str = itemService.getItem();
        request.setAttribute("items",str);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
