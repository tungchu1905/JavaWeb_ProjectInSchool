package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Product;
import java.util.List;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container wrapper\">\n");
      out.write("            <div class=\"row cart-head\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <p></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div style=\"display: table; margin: auto;\">\n");
      out.write("                            <span class=\"step step_complete\"> <a href=\"#\" class=\"check-bc\">Cart</a> <span class=\"step_line step_complete\"> </span> <span class=\"step_line backline\"> </span> </span>\n");
      out.write("                            <span class=\"step step_complete\"> <a href=\"#\" class=\"check-bc\">Checkout</a> <span class=\"step_line \"> </span> <span class=\"step_line step_complete\"> </span> </span>\n");
      out.write("                            <span class=\"step_thankyou check-bc step_complete\">Thank you</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <p></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("            <div class=\"row cart-body\">\n");
      out.write("                <form class=\"form-horizontal\" method=\"post\" action=\"\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-push-6 col-sm-push-6\">\n");
      out.write("                        <!--REVIEW ORDER-->\n");
      out.write("                        <div class=\"panel panel-info\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                Review Order <div class=\"pull-right\"><small><a class=\"afix-1\" href=\"#\">Edit Cart</a></small></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-3 col-xs-3\">\n");
      out.write("                                        <img class=\"img-responsive\" src=\"//c1.staticflickr.com/1/466/19681864394_c332ae87df_t.jpg\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6 col-xs-6\">\n");
      out.write("                                        <div class=\"col-xs-12\">Product name</div>\n");
      out.write("                                        <div class=\"col-xs-12\"><small>Quantity:<span>1</span></small></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-3 col-xs-3 text-right\">\n");
      out.write("                                        <h6><span>$</span>25.00</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\"><hr /></div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-3 col-xs-3\">\n");
      out.write("                                        <img class=\"img-responsive\" src=\"//c1.staticflickr.com/1/466/19681864394_c332ae87df_t.jpg\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6 col-xs-6\">\n");
      out.write("                                        <div class=\"col-xs-12\">Product name</div>\n");
      out.write("                                        <div class=\"col-xs-12\"><small>Quantity:<span>1</span></small></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-3 col-xs-3 text-right\">\n");
      out.write("                                        <h6><span>$</span>25.00</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\"><hr /></div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-3 col-xs-3\">\n");
      out.write("                                        <img class=\"img-responsive\" src=\"//c1.staticflickr.com/1/466/19681864394_c332ae87df_t.jpg\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6 col-xs-6\">\n");
      out.write("                                        <div class=\"col-xs-12\">Product name</div>\n");
      out.write("                                        <div class=\"col-xs-12\"><small>Quantity:<span>2</span></small></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-3 col-xs-3 text-right\">\n");
      out.write("                                        <h6><span>$</span>50.00</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\"><hr /></div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-xs-12\">\n");
      out.write("                                        <strong>Subtotal</strong>\n");
      out.write("                                        <div class=\"pull-right\"><span>$</span><span>200.00</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-12\">\n");
      out.write("                                        <small>Shipping</small>\n");
      out.write("                                        <div class=\"pull-right\"><span>-</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\"><hr /></div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-xs-12\">\n");
      out.write("                                        <strong>Order Total</strong>\n");
      out.write("                                        <div class=\"pull-right\"><span>$</span><span>150.00</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--REVIEW ORDER END-->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-pull-6 col-sm-pull-6\">\n");
      out.write("                        <!--SHIPPING METHOD-->\n");
      out.write("                        <div class=\"panel panel-info\">\n");
      out.write("                            <div class=\"panel-heading\">Address</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <h4>Shipping Address</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Country:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"country\" value=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-6 col-xs-12\">\n");
      out.write("                                        <strong>First Name:</strong>\n");
      out.write("                                        <input type=\"text\" name=\"first_name\" class=\"form-control\" value=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"span1\"></div>\n");
      out.write("                                    <div class=\"col-md-6 col-xs-12\">\n");
      out.write("                                        <strong>Last Name:</strong>\n");
      out.write("                                        <input type=\"text\" name=\"last_name\" class=\"form-control\" value=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Address:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" name=\"address\" class=\"form-control\" value=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>City:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" name=\"city\" class=\"form-control\" value=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>State:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" name=\"state\" class=\"form-control\" value=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Zip / Postal Code:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" name=\"zip_code\" class=\"form-control\" value=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Phone Number:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\"><input type=\"text\" name=\"phone_number\" class=\"form-control\" value=\"\" /></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Email Address:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\"><input type=\"text\" name=\"email_address\" class=\"form-control\" value=\"\" /></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--SHIPPING METHOD END-->\n");
      out.write("                        <!--CREDIT CART PAYMENT-->\n");
      out.write("                        <div class=\"panel panel-info\">\n");
      out.write("                            <div class=\"panel-heading\"><span><i class=\"glyphicon glyphicon-lock\"></i></span> Secure Payment</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Card Type:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <select id=\"CreditCardType\" name=\"CreditCardType\" class=\"form-control\">\n");
      out.write("                                            <option value=\"5\">Visa</option>\n");
      out.write("                                            <option value=\"6\">MasterCard</option>\n");
      out.write("                                            <option value=\"7\">American Express</option>\n");
      out.write("                                            <option value=\"8\">Discover</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Credit Card Number:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\"><input type=\"text\" class=\"form-control\" name=\"car_number\" value=\"\" /></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Card CVV:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\"><input type=\"text\" class=\"form-control\" name=\"car_code\" value=\"\" /></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <strong>Expiration Date</strong>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                                        <select class=\"form-control\" name=\"\">\n");
      out.write("                                            <option value=\"\">Month</option>\n");
      out.write("                                            <option value=\"01\">01</option>\n");
      out.write("                                            <option value=\"02\">02</option>\n");
      out.write("                                            <option value=\"03\">03</option>\n");
      out.write("                                            <option value=\"04\">04</option>\n");
      out.write("                                            <option value=\"05\">05</option>\n");
      out.write("                                            <option value=\"06\">06</option>\n");
      out.write("                                            <option value=\"07\">07</option>\n");
      out.write("                                            <option value=\"08\">08</option>\n");
      out.write("                                            <option value=\"09\">09</option>\n");
      out.write("                                            <option value=\"10\">10</option>\n");
      out.write("                                            <option value=\"11\">11</option>\n");
      out.write("                                            <option value=\"12\">12</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                                        <select class=\"form-control\" name=\"\">\n");
      out.write("                                            <option value=\"\">Year</option>\n");
      out.write("                                            <option value=\"2015\">2015</option>\n");
      out.write("                                            <option value=\"2016\">2016</option>\n");
      out.write("                                            <option value=\"2017\">2017</option>\n");
      out.write("                                            <option value=\"2018\">2018</option>\n");
      out.write("                                            <option value=\"2019\">2019</option>\n");
      out.write("                                            <option value=\"2020\">2020</option>\n");
      out.write("                                            <option value=\"2021\">2021</option>\n");
      out.write("                                            <option value=\"2022\">2022</option>\n");
      out.write("                                            <option value=\"2023\">2023</option>\n");
      out.write("                                            <option value=\"2024\">2024</option>\n");
      out.write("                                            <option value=\"2025\">2025</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <span>Pay secure using your credit card.</span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <ul class=\"cards\">\n");
      out.write("                                            <li class=\"visa hand\">Visa</li>\n");
      out.write("                                            <li class=\"mastercard hand\">MasterCard</li>\n");
      out.write("                                            <li class=\"amex hand\">Amex</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary btn-submit-fix\">Place Order</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--CREDIT CART PAYMENT END-->\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row cart-footer\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
