package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\n");
      out.write("    <ul class=\"nav\">\n");
      out.write("        <li class=\"nav-item nav-profile\">\n");
      out.write("            <a href=\"#\" class=\"nav-link\">\n");
      out.write("                <div class=\"nav-profile-image\">\n");
      out.write("                    <img src=\"Template/images/faces/face1.jpg\" alt=\"profile\">\n");
      out.write("                    <span class=\"login-status online\"></span> <!--change to offline or busy as needed-->              \n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav-profile-text d-flex flex-column\">\n");
      out.write("                    <span class=\"font-weight-bold mb-2\">David Grey. H</span>\n");
      out.write("                    <span class=\"text-secondary text-small\">Project Manager</span>\n");
      out.write("                </div>\n");
      out.write("                <i class=\"mdi mdi-bookmark-check text-success nav-profile-badge\"></i>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"Template/index.jsp\">\n");
      out.write("                <span class=\"menu-title\">Dashboard</span>\n");
      out.write("                <i class=\"mdi mdi-home menu-icon\"></i>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#ui-basic\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\n");
      out.write("                <span class=\"menu-title\">Gestion</span>\n");
      out.write("                <i class=\"menu-arrow\"></i>\n");
      out.write("                <i class=\"mdi mdi-crosshairs-gps menu-icon\"></i>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"collapse\" id=\"ui-basic\">\n");
      out.write("                <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Niveau.jsp\">Gestion des niveaux</a></li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Categorie.jsp\">Gestion des categories</a></li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Matiere.jsp\">Gestion des Matieres</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"Template/pages/icons/mdi.html\">\n");
      out.write("                <span class=\"menu-title\">Icons</span>\n");
      out.write("                <i class=\"mdi mdi-contacts menu-icon\"></i>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"Template/pages/forms/basic_elements.html\">\n");
      out.write("                <span class=\"menu-title\">Gestion des niveaux</span>\n");
      out.write("                <i class=\"mdi mdi-format-list-bulleted menu-icon\"></i>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"Template/pages/charts/chartjs.html\">\n");
      out.write("                <span class=\"menu-title\">Charts</span>\n");
      out.write("                <i class=\"mdi mdi-chart-bar menu-icon\"></i>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"Template/pages/tables/basic-table.html\">\n");
      out.write("                <span class=\"menu-title\">Tables</span>\n");
      out.write("                <i class=\"mdi mdi-table-large menu-icon\"></i>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#general-pages\" aria-expanded=\"false\" aria-controls=\"general-pages\">\n");
      out.write("                <span class=\"menu-title\">Sample Pages</span>\n");
      out.write("                <i class=\"menu-arrow\"></i>\n");
      out.write("                <i class=\"mdi mdi-medical-bag menu-icon\"></i>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"collapse\" id=\"general-pages\">\n");
      out.write("                <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Template/pages/samples/blank-page.html\"> Blank Page </a></li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Template/pages/samples/login.html\"> Login </a></li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Template/pages/samples/register.html\"> Register </a></li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Template/pages/samples/error-404.html\"> 404 </a></li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Template/pages/samples/error-500.html\"> 500 </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item sidebar-actions\">\n");
      out.write("            <span class=\"nav-link\">\n");
      out.write("                <div class=\"border-bottom\">\n");
      out.write("                    <h6 class=\"font-weight-normal mb-3\">Projects</h6>                \n");
      out.write("                </div>\n");
      out.write("                <button class=\"btn btn-block btn-lg btn-gradient-primary mt-4\">+ Add a project</button>\n");
      out.write("                <div class=\"mt-4\">\n");
      out.write("                    <div class=\"border-bottom\">\n");
      out.write("                        <p class=\"text-secondary\">Categories</p>                  \n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"gradient-bullet-list mt-4\">\n");
      out.write("                        <li>Free</li>\n");
      out.write("                        <li>Pro</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </span>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</nav>");
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
