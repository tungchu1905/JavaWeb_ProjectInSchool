package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-xl-12\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"header-title pb-3 mt-0\">Payments</h5>\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("                        <table class=\"table table-hover mb-0\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr class=\"align-self-center\">\n");
      out.write("                                    <th>Project Name</th>\n");
      out.write("                                    <th>Client Name</th>\n");
      out.write("                                    <th>Payment Type</th>\n");
      out.write("                                    <th>Paid Date</th>\n");
      out.write("                                    <th>Amount</th>\n");
      out.write("                                    <th>Transaction</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Product Devlopment</td>\n");
      out.write("                                    <td><img src=\"https://bootdey.com/img/Content/avatar/avatar1.png\" alt=\"\" class=\"thumb-sm rounded-circle mr-2\"> Kevin Heal</td>\n");
      out.write("                                    <td>Paypal</td>\n");
      out.write("                                    <td>5/8/2018</td>\n");
      out.write("                                    <td>$15,000</td>\n");
      out.write("                                    <td><span class=\"badge badge-boxed badge-soft-warning\">panding</span></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>New Office Building</td>\n");
      out.write("                                    <td><img src=\"https://bootdey.com/img/Content/avatar/avatar2.png\" alt=\"\" class=\"thumb-sm rounded-circle mr-2\"> Frank M. Lyons</td>\n");
      out.write("                                    <td>Paypal</td>\n");
      out.write("                                    <td>15/7/2018</td>\n");
      out.write("                                    <td>$35,000</td>\n");
      out.write("                                    <td><span class=\"badge badge-boxed badge-soft-primary\">Success</span></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Market Research</td>\n");
      out.write("                                    <td><img src=\"https://bootdey.com/img/Content/avatar/avatar3.png\" alt=\"\" class=\"thumb-sm rounded-circle mr-2\"> Angelo Butler</td>\n");
      out.write("                                    <td>Pioneer</td>\n");
      out.write("                                    <td>30/9/2018</td>\n");
      out.write("                                    <td>$45,000</td>\n");
      out.write("                                    <td><span class=\"badge badge-boxed badge-soft-warning\">Panding</span></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Website &amp; Blog</td>\n");
      out.write("                                    <td><img src=\"https://bootdey.com/img/Content/avatar/avatar4.png\" alt=\"\" class=\"thumb-sm rounded-circle mr-2\"> Phillip Morse</td>\n");
      out.write("                                    <td>Paypal</td>\n");
      out.write("                                    <td>2/6/2018</td>\n");
      out.write("                                    <td>$70,000</td>\n");
      out.write("                                    <td><span class=\"badge badge-boxed badge-soft-warning\">Success</span></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Product Devlopment</td>\n");
      out.write("                                    <td><img src=\"https://bootdey.com/img/Content/avatar/avatar6.png\" alt=\"\" class=\"thumb-sm rounded-circle mr-2\"> Kevin Heal</td>\n");
      out.write("                                    <td>Paypal</td>\n");
      out.write("                                    <td>5/8/2018</td>\n");
      out.write("                                    <td>$15,000</td>\n");
      out.write("                                    <td><span class=\"badge badge-boxed badge-soft-primary\">panding</span></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>New Office Building</td>\n");
      out.write("                                    <td><img src=\"https://bootdey.com/img/Content/avatar/avatar7.png\" alt=\"\" class=\"thumb-sm rounded-circle mr-2\"> Frank M. Lyons</td>\n");
      out.write("                                    <td>Paypal</td>\n");
      out.write("                                    <td>15/7/2018</td>\n");
      out.write("                                    <td>$35,000</td>\n");
      out.write("                                    <td><span class=\"badge badge-boxed badge-soft-primary\">Success</span></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <!--end table-responsive-->\n");
      out.write("                    <div class=\"pt-3 border-top text-right\"><a href=\"#\" class=\"text-primary\">View all <i class=\"mdi mdi-arrow-right\"></i></a></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
