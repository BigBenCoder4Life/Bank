package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Virginia Schools Data Analysis </title>\n");
      out.write("        <link rel= \"stylesheet\" href= \"stylesheet.css\" />\n");
      out.write("        <link rel =\"stylesheet\" href= \"theme.css\" />\n");
      out.write("        <script type = \"text/javascript\" src = \"bootstrap.min.js\"></script>\n");
      out.write("        <script type = \"text/javascript\" src = \"divsch.js\">\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-inverse-collapse\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">The Bank</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar-collapse collapse navbar-inverse-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <!--This is where the buttons are on the left -->\n");
      out.write("                    <li class=\"active\"><a href=\"#\">About</a></li>\n");
      out.write("                    <li><a href=\"#\">Information</a></li>\n");
      out.write("                    <li><a href=\"#\">Links</a></a>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"#\">Help</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"BodyContainer\">\n");
      out.write("\n");
      out.write("            <!-- BEGINNING OF TITLE & PICTURE LINK SECTION-->\n");
      out.write("            <div class=\"title\">  \n");
      out.write("                The Bank\n");
      out.write("                <br>\n");
      out.write("                Development Team: The Bank\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h1>Welcome!</h1>\n");
      out.write("                <p>Welcome to The Bank.</p>\n");
      out.write("            </div>   \n");
      out.write("\n");
      out.write("            <div class=\"btn-group btn-group-justified\">\n");
      out.write("                <a href=\"links/trophyPage.jsp\" class=\"btn btn-default\">School Comparison Tool</a>\n");
      out.write("                <a href=\"links/awardPage.jsp\" class=\"btn btn-default\">Sol Data Tool</a>\n");
      out.write("                <a href=\"links/virginiaPage2.jsp\" class=\"btn btn-default\">School Map Tool</a>\n");
      out.write("            </div>\n");
      out.write("            <!--BEGINNING OF BOTTOM LINKS SECTION-->\n");
      out.write("            <div class=\"Links\">  \n");
      out.write("                Links:\n");
      out.write("                <br>\n");
      out.write("                <a href=\"links/trophyPage.jsp\"> High School Statistics</a>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"links/virginiaPage2.jsp\"> Virginia School Tool</a>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"links/awardPage.jsp\"> SOL Analysis</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"AboutUs\">    \n");
      out.write("                About Us:\n");
      out.write("                <br>\n");
      out.write("                <a href=\"http://www.jmu.edu/\"> James Madison University</a> \n");
      out.write("                <br>\n");
      out.write("                <a href=\"links/developmentTeamPage.jsp\"> Development Team</a>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"links/missionPage.jsp\"> Mission</a>     \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"Help\">    \n");
      out.write("                Help:\n");
      out.write("                <br>\n");
      out.write("                <a href=\"links/linkedPage.jsp\"> Overview of Tool Results</a>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"links/linkedPage.jsp\"> Virginia Analysis Tools</a>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"links/linkedPage.jsp\"> Tool Features</a>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"links/linkedPage.jsp\"> Tutorials</a>     \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"Information\">    \n");
      out.write("                Information:\n");
      out.write("                <br>\n");
      out.write("                <a href=\"http://www.doe.virginia.gov/info_management/longitudinal_data_system/\"> Virginia Longitudinal Data System</a>  \n");
      out.write("                <br>\n");
      out.write("                <a href=\"https://fafsa.ed.gov/\"> Financial Aid Website</a>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"http://www.pen.k12.va.us/news/news_releases/2013/mar13_gov.shtml\"> Virginia Awards</a>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"http://en.wikipedia.org/wiki/Virginia\"> About Virginia</a>    \n");
      out.write("            </div>\n");
      out.write("            <!-- END OF BOTTOM LINKS SECTION-->\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
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
