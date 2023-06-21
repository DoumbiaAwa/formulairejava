package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Deconnection_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <fieldset>\n");
      out.write("            \n");
      out.write("            <h1 style=\"text-align: center; color: blue\">Connection</h1>\n");
      out.write("            <center>\n");
      out.write("                 <form action=\"../DeconnectionServlet\" method=\"POST\">\n");
      out.write("                  <div style=\"width: 50%; border: 4px \">\n");
      out.write("        \n");
      out.write("           \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\"style=\"float: left\">Pseudo</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"pseudo\" aria-describedby=\"emailHelp\" placeholder=\"Entrez votre pseudo\">\n");
      out.write("      </div>\n");
      out.write("     <br>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputPassword1\"style=\"float: left\">Password</label>\n");
      out.write("    <input type=\"password\" class=\"form-control\" name=\"mtp\" placeholder=\"Password\">\n");
      out.write("  </div>\n");
      out.write("     <br>\n");
      out.write("     </div>\n");
      out.write("     \n");
      out.write("                   <div class = \"lOg\">\n");
      out.write("                <i class=\" fa-solid fa-right-fron-bracket\"> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/page/liste.jsp\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary\">Connection</button>\n");
      out.write("            </a>\n");
      out.write("        </i>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("      </center> \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("          \n");
      out.write("    </body>\n");
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
