package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Entity.Data;
import java.util.ArrayList;

public final class loadData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>The National Train System</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/sri_lanka_railway_logo_p03_icon.ico\"/>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/perfect-scrollbar/perfect-scrollbar.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util_1.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main_1.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("            <div class=\"container-table100\">\n");
      out.write("                <div class=\"wrap-table100\">\n");
      out.write("                    <div class=\"table100\">\n");
      out.write("                        <table>\n");
      out.write("                            <thead>\n");
      out.write("                                <tr class=\"table100-head\">\n");
      out.write("                                    <th class=\"column1\">Track ID</th>\n");
      out.write("                                    <th class=\"column2\">Train</th>\n");
      out.write("                                    <th class=\"column3\">Location</th>\n");
      out.write("                                    <th class=\"column4\">Date</th>\n");
      out.write("                                    <th class=\"column5\">Time</th>\n");
      out.write("                                    <th class=\"column6\">Temperature</th>\n");
      out.write("                                    <th class=\"column7\">Speed</th>\n");
      out.write("                                    <th class=\"column8\">Humidity</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                \n");
      out.write("                                ");

List<Data> list=(List<Data>)request.getAttribute("data");
for (Data d : list) {
    

      out.write("    \n");
      out.write("   \n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"column1\">");
      out.print(d.getTrackId() );
      out.write("</td>\n");
      out.write("                                    <td class=\"column2\">");
      out.print(d.getTrainName() );
      out.write("</td>\n");
      out.write("                                    <td class=\"column3\">");
      out.print(d.getLocation());
      out.write("</td>\n");
      out.write("                                    <td class=\"column4\">");
      out.print(d.getDate() );
      out.write("</td>\n");
      out.write("                                    <td class=\"column5\">");
      out.print(d.getTime() );
      out.write("</td>\n");
      out.write("                                    <td class=\"column6\">");
      out.print(d.getHuminity() );
      out.write("</td>\n");
      out.write("                                    <td class=\"column7\">");
      out.print(d.getSpeed() );
      out.write("</td>\n");
      out.write("                                     <td class=\"column8\">");
      out.print(d.getHuminity() );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                               \n");
}
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"js/main_2.js\"></script>\n");
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
