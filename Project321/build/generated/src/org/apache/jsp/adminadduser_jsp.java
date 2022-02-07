package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminadduser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            form{\n");
      out.write("                width: 50%;\n");
      out.write("                height: 100%;\n");
      out.write("                border:2px solid black;\n");
      out.write("                background-color: #FF99CC;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <form  action=\"login\" method=\"post\">\n");
      out.write("            <h2 style=\"text-align: center;font-family: monospace; color: #FF6633\"> Vui Lòng Đăng Kí</h2>\n");
      out.write("\n");
      out.write("            <div class=\"divinput\">\n");
      out.write("                <input oninput=\"checkusername()\" id=\"usercheck\" class=\"inputregister\" type=\"text\" name=\"username\" value=\"\"\n");
      out.write("                       placeholder=\"Username have 8 - 32 character\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"divinput\">\n");
      out.write("                <input oninput=\"checkpass()\" id=\"pass\" class=\"inputregister\" type=\"password\" name=\"password\" value=\"\"\n");
      out.write("                       placeholder=\"Password have more than 6 character\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"divinput\">\n");
      out.write("                <input oninput=\"checkrepass()\" id=\"repass\" class=\"inputregister\" type=\"password\" name=\"repassword\" value=\"\"\n");
      out.write("                       placeholder=\"Repeat your password\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("\n");
      out.write("                <input type=\"hidden\" value=\"signup\" name=\"command\">\n");
      out.write("                <input style=\"margin: 10px 0 0 40px; width: 20%; height:  40px\" id=\"dangki\" onclick=\"checklogin()\" type=\"submit\" value=\"Dang Ki\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
