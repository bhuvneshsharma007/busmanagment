package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean.Bus;
import java.util.ListIterator;
import java.util.List;
import Dao.BusOperation;

public final class View_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"head\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("  <h1> Routes</h1>\n");
      out.write("  \n");
      out.write("  <table id=\"keywords\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th><span>Driver Name</span></th>\n");
      out.write("        <th><span>Driver Contact</span></th>\n");
      out.write("        <th><span>Bus Number</span></th>\n");
      out.write("        <th><span>Bus Route</span></th>\n");
      out.write("        <th><span>Timing</span></th>\n");
      out.write("        <th><span></span></th>\n");
      out.write("        <th><span></span></th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("     ");

                    BusOperation st = new BusOperation();
                    List li = st.selectAllBus();
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Bus bus= (Bus) lit.next();
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(bus.getDriverName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(bus.getDriverContact());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(bus.getBusNo());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(bus.getBusRoute());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(bus.getBusTime());
      out.write("</td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    <td><a href=\"update.jsp?id=");
      out.print(bus.getB_id());
      out.write("\">UPDATE</a></td>\n");
      out.write("                    <td><a href=\"delete.jsp?id=");
      out.print(bus.getB_id());
      out.write("\">DELETE</a></td>\n");
      out.write("                </tr> \n");
      out.write("                ");
}
      out.write("\n");
      out.write("    \n");
      out.write("  </table>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
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
