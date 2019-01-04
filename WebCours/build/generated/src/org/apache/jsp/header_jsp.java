package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<nav class=\"navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\n");
      out.write("    <div class=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-center\">\n");
      out.write("        <a class=\"navbar-brand brand-logo\" href=\"Template/index.html\"><img src=\"Template/images/logo.svg\" alt=\"logo\"/></a>\n");
      out.write("        <a class=\"navbar-brand brand-logo-mini\" href=\"Template/index.html\"><img src=\"Template/images/logo-mini.svg\" alt=\"logo\"/></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"navbar-menu-wrapper d-flex align-items-stretch\">\n");
      out.write("        <div class=\"search-field d-none d-md-block\">\n");
      out.write("            <form class=\"d-flex align-items-center h-100\" action=\"#\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <div class=\"input-group-prepend bg-transparent\">\n");
      out.write("                        <i class=\"input-group-text border-0 mdi mdi-magnify\"></i>                \n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"text\" class=\"form-control bg-transparent border-0\" placeholder=\"Search projects\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"navbar-nav navbar-nav-right\">\n");
      out.write("            <li class=\"nav-item nav-profile dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" id=\"profileDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    <div class=\"nav-profile-img\">\n");
      out.write("                        <img src=\"Template/images/faces/face1.jpg\" alt=\"image\">\n");
      out.write("                        <span class=\"availability-status online\"></span>             \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"nav-profile-text\">\n");
      out.write("                        <p class=\"mb-1 text-black\">David Greymaax</p>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu navbar-dropdown\" aria-labelledby=\"profileDropdown\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                        <i class=\"mdi mdi-cached mr-2 text-success\"></i>\n");
      out.write("                        Activity Log\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                        <i class=\"mdi mdi-logout mr-2 text-primary\"></i>\n");
      out.write("                        Signout\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item d-none d-lg-block full-screen-link\">\n");
      out.write("                <a class=\"nav-link\">\n");
      out.write("                    <i class=\"mdi mdi-fullscreen\" id=\"fullscreen-button\"></i>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link count-indicator dropdown-toggle\" id=\"messageDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    <i class=\"mdi mdi-email-outline\"></i>\n");
      out.write("                    <span class=\"count-symbol bg-warning\"></span>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown preview-list\" aria-labelledby=\"messageDropdown\">\n");
      out.write("                    <h6 class=\"p-3 mb-0\">Messages</h6>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item preview-item\">\n");
      out.write("                        <div class=\"preview-thumbnail\">\n");
      out.write("                            <img src=\"Template/images/faces/face4.jpg\" alt=\"image\" class=\"profile-pic\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                            <h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Mark send you a message</h6>\n");
      out.write("                            <p class=\"text-gray mb-0\">\n");
      out.write("                                1 Minutes ago\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item preview-item\">\n");
      out.write("                        <div class=\"preview-thumbnail\">\n");
      out.write("                            <img src=\"Template/images/faces/face2.jpg\" alt=\"image\" class=\"profile-pic\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                            <h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Cregh send you a message</h6>\n");
      out.write("                            <p class=\"text-gray mb-0\">\n");
      out.write("                                15 Minutes ago\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item preview-item\">\n");
      out.write("                        <div class=\"preview-thumbnail\">\n");
      out.write("                            <img src=\"Template/images/faces/face3.jpg\" alt=\"image\" class=\"profile-pic\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                            <h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Profile picture updated</h6>\n");
      out.write("                            <p class=\"text-gray mb-0\">\n");
      out.write("                                18 Minutes ago\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <h6 class=\"p-3 mb-0 text-center\">4 new messages</h6>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link count-indicator dropdown-toggle\" id=\"notificationDropdown\" href=\"#\" data-toggle=\"dropdown\">\n");
      out.write("                    <i class=\"mdi mdi-bell-outline\"></i>\n");
      out.write("                    <span class=\"count-symbol bg-danger\"></span>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown preview-list\" aria-labelledby=\"notificationDropdown\">\n");
      out.write("                    <h6 class=\"p-3 mb-0\">Notifications</h6>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item preview-item\">\n");
      out.write("                        <div class=\"preview-thumbnail\">\n");
      out.write("                            <div class=\"preview-icon bg-success\">\n");
      out.write("                                <i class=\"mdi mdi-calendar\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                            <h6 class=\"preview-subject font-weight-normal mb-1\">Event today</h6>\n");
      out.write("                            <p class=\"text-gray ellipsis mb-0\">\n");
      out.write("                                Just a reminder that you have an event today\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item preview-item\">\n");
      out.write("                        <div class=\"preview-thumbnail\">\n");
      out.write("                            <div class=\"preview-icon bg-warning\">\n");
      out.write("                                <i class=\"mdi mdi-settings\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                            <h6 class=\"preview-subject font-weight-normal mb-1\">Settings</h6>\n");
      out.write("                            <p class=\"text-gray ellipsis mb-0\">\n");
      out.write("                                Update dashboard\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item preview-item\">\n");
      out.write("                        <div class=\"preview-thumbnail\">\n");
      out.write("                            <div class=\"preview-icon bg-info\">\n");
      out.write("                                <i class=\"mdi mdi-link-variant\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                            <h6 class=\"preview-subject font-weight-normal mb-1\">Launch Admin</h6>\n");
      out.write("                            <p class=\"text-gray ellipsis mb-0\">\n");
      out.write("                                New admin wow!\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <h6 class=\"p-3 mb-0 text-center\">See all notifications</h6>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item nav-logout d-none d-lg-block\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                    <i class=\"mdi mdi-power\"></i>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item nav-settings d-none d-lg-block\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                    <i class=\"mdi mdi-format-line-spacing\"></i>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-toggle=\"offcanvas\">\n");
      out.write("            <span class=\"mdi mdi-menu\"></span>\n");
      out.write("        </button>\n");
      out.write("    </div>\n");
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
