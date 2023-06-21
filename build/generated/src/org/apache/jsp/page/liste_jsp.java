package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class liste_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("     <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n");
      out.write("    <title>Page Accueil</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write(" <h1 style=\"text-align: center; color: blue; font-size: 50px\">Bienvenue sur notre page ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inscription.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h1> \n");
      out.write(" <div style=\"width:100%\">\n");
      out.write("  <img src= \"\">\n");
      out.write("  </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write(" <h2 style=\"text-align: center; background-color: buttonface\">Liste des personnes déjà inscrit</h2>  \n");
      out.write(" <br>\n");
      out.write("        \n");
      out.write("        <table style=\"border: 5px\"class=\"table table-bordered\">\n");
      out.write("     <thead>\n");
      out.write("      <tr>\n");
      out.write("      <th scope=\"col\">#</th>\n");
      out.write("      <th scope=\"col\">Nom</th>\n");
      out.write("      <th scope=\"col\">Prenom</th>\n");
      out.write("      <th scope=\"col\">Pseudo</th>\n");
      out.write("      <th scope=\"col\">Email</th>\n");
      out.write("      </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">1</th>\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inscription.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inscription.prenom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inscription.pseudo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("       <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inscription.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     \n");
      out.write("            <br>\n");
      out.write("    <center>\n");
      out.write("            \n");
      out.write("            <div class = \"log\">\n");
      out.write("                <i class=\" fa-solid fa-right-fron-bracket\"> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/page/Deconnection.jsp\">\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Deconnection</button>\n");
      out.write("            </a>\n");
      out.write("        </i>\n");
      out.write("        </div>\n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("            \n");
      out.write("              </body>\n");
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
