/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Student;
import Bean.Userdao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Signservlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out=response.getWriter();
       System.out.println(request.getParameter("unm"));
       String unm=request.getParameter("unm");
       String pswd=request.getParameter("pswd");
       String dropdown=request.getParameter("dropdown");
       Student s=new Student();
       s.setUnm(unm);
       s.setPswd(pswd);
       s.setDropdown(dropdown);
       Userdao ud=new Userdao();
       System.out.println(ud.check(s));
       response.sendRedirect("index.html");
    }
}
