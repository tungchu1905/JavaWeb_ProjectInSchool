package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("        <link href=\"css/register.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header2\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                <a href=\"home\">\n");
      out.write("                    <img src=\"img/logo/logo.png\"> \n");
      out.write("                </a> \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <div class=\"middle\">\n");
      out.write("                <a  href=\"home\" > Trang chu </a>\n");
      out.write("                <a > Gio Hang </a>\n");
      out.write("                <a href=\"shop\"> San Pham  </a>\n");
      out.write("                <a> Tin tuc </a>\n");
      out.write("                <a> Lien he</a>\n");
      out.write("            </div>\n");
      out.write("            <div\n");
      out.write("                class=\"right\"> <a href=\"login.jsp\"> Login</a>/ \n");
      out.write("                Cart\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"margin: 20px\">\n");
      out.write("            <form action=\"search\" method=\"get\">\n");
      out.write("                <input type=\"text\" placeholder=\"Tim kiem\" name=\"searchname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nameofsearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                   <input type=\"submit\" value=\"Tim Kiem\">\n");
      out.write("            </form>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <h1 style=\"text-align: center;\">Dang ky tai khoan</h1> \n");
      out.write("        <div class=\"registerform\" >\n");
      out.write("            <div class=\"registerleft\">\n");
      out.write("                <a href=\"login.jsp\" class=\"login\"> Da co tai khoan? Dang nhap ngay </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"registerright\">\n");
      out.write("\n");
      out.write("                <form  action=\"#\" method=\"post\">\n");
      out.write("                    <h2 style=\"text-align: center\"> Vui Long Dang Nhap</h2>\n");
      out.write("\n");
      out.write("                    <div class=\"divinput\">\n");
      out.write("                        <input class=\"inputregister\" type=\"text\" name=\"username\" value=\"\"\n");
      out.write("                               placeholder=\"Username\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"divinput\">\n");
      out.write("                        <input class=\"inputregister\" type=\"password\" name=\"password\" value=\"\"\n");
      out.write("                               placeholder=\"Password\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"divinput\">\n");
      out.write("                        <input class=\"inputregister\" type=\"password\" name=\"repassword\" value=\"\"\n");
      out.write("                               placeholder=\"Repeat your password\" required>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <button type=\"submit\" value=\"register\" >\n");
      out.write("                            Sign Up\n");
      out.write("                        </button>\n");
      out.write("                        <!--<a href=\"#\">forget password?</a>-->\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
