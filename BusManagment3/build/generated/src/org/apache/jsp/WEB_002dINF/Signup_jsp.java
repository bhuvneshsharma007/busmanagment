package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("body  \n");
      out.write("form {border: 3px solid #f1f1f1;}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  width: 20%;\n");
      out.write("  padding: 10px 10px;\n");
      out.write("  margin: 5px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write(".mylist {\n");
      out.write("  width: 60%;\n");
      out.write("  padding: 10px 10px;\n");
      out.write("  margin: 2px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("  background-color: red;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  margin: 2px 0;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 10%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("  opacity: 0.5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.psw {\n");
      out.write("  float: right;\n");
      out.write("  padding-top: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"text-align: center;\" background=\"bb.jpg\">\n");
      out.write("  <form name=\"myform\" action=\"Signservlet\" method=\"post\" onsubmit=\"return myvalidation()\">\n");
      out.write("<h2>Sign up  Here</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <label for=\"uname\" style=\"text-align:left;\"><b>Username</b></label> <br>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Username\" name=\"unm\">\n");
      out.write("    <br><br> \n");
      out.write("    <label for=\"Email\" style=\"text-align:left;\"><b>Email id</b></label>\n");
      out.write("    <br>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Email\" name=\"mail\"><br><br>\n");
      out.write("     <label for=\"psw\" style=\"text-align:left;\"><b> Password</b></label>\n");
      out.write("    <br>\n");
      out.write("    <input type=\"password\" placeholder=\"Password\" name=\"pswd1\"><br><br>\n");
      out.write("    <label style=\"text-align:left\"><b>Select List</b></label><br>\n");
      out.write("             <select id = \"myList\" style=\"width:270px;height:40px;\" name=\"dropdown\">\n");
      out.write("               <option value = \"1\">Student</option>\n");
      out.write("               <option value = \"2\">Faculity</option>\n");
      out.write("               <option value = \"3\">Staff</option>\n");
      out.write("                           </select></div><br><br>\n");
      out.write("        \n");
      out.write("    <button type=\"submit\">sign up</button>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("  function myvalidation(){\n");
      out.write("  var Username=document.forms[\"myform\"][\"unm\"].value;\n");
      out.write("  var Email-id=document.forms[\"myform\"][\"mail\"].value;\n");
      out.write("  var Password=document.forms[\"myform\"][\"pswd\"].value;\n");
      out.write("  \n");
      out.write("    flag=true;\n");
      out.write("\n");
      out.write("  if(Username==\"\"){\n");
      out.write("     alert(\"name can not be empty\");\n");
      out.write("     var flag=false;\n");
      out.write("  } \n");
      out.write("  if(Email-id==\"\"){\n");
      out.write("    alert(\"Email can not be empty\");\n");
      out.write("\n");
      out.write("    var flag =false;\n");
      out.write("  }\n");
      out.write("  if(Password==\"\"){\n");
      out.write("     alert(\"password can not be empty\");\n");
      out.write("      \n");
      out.write("     var flag=false;\n");
      out.write("  }\n");
      out.write(" return flag;\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
