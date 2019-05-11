/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Student;
import Bean.Validate;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Logservlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out=response.getWriter();
       String unm=request.getParameter("unm");
       String pswd=request.getParameter("pswd");
       String dropdown=request.getParameter("dropdown");
       System.out.println(dropdown);
       if(dropdown.equals("Student")){
           if(Validate.checkUser(unm,pswd)){
               RequestDispatcher rd=request.getRequestDispatcher("index.html");
               rd.forward(request,response);
           }
           else{
               out.println("Something is incorect");
           }
    }
       else if(dropdown.equals("Faculty")){
           if(Validate.checkUser(unm,pswd)){
               RequestDispatcher rd=request.getRequestDispatcher("admin.html");
               rd.forward(request,response);
           }
       }

 
}
}
