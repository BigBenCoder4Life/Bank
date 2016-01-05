package org.apache.jsp.links;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import db.*;

public final class virginiaPage2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        ");
      out.write("       \n");
      out.write("        <script\n");
      out.write("            src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyDY0kkJiTPVd2U7aTOAwhc9ySH6oHxOIYM&sensor=false\">\n");
      out.write("        </script>\n");
      out.write("        ");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Virginia Statistics</title>\n");
      out.write("        <link rel= \"stylesheet\" href= \"../stylesheet.css\" />  \n");
      out.write("\n");
      out.write("        <!--Load the AJAX API-->\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"../divsch.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            // Load the Visualization API and the piechart package.\n");
      out.write("            google.load('visualization', '1.0', {'packages': ['corechart', 'map']});\n");
      out.write("                  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            google.setOnLoadCallback(drawChart);\n");
      out.write("\n");
      out.write("            function drawChart() {\n");
      out.write("                var data = google.visualization.arrayToDataTable([\n");
      out.write("                ");

                    SchoolData.PrintVirginiaData(request,out);
                
      out.write("\n");
      out.write("                ]);\n");
      out.write("\n");
      out.write("                var options = {\n");
      out.write("                    title: ' ");
      out.print( request.getParameter("sch_year"));
      out.write("',\n");
      out.write("                    vAxis: {title: 'Virginia School Counts',\n");
      out.write("                        titleTextStyle: {color: 'red'}}\n");
      out.write("                };\n");
      out.write("                var chart1 = new google.visualization.BarChart(document.getElementById('chart_div1'));\n");
      out.write("               \n");
      out.write("              ");
 if(request.getParameter("sch_year") != null)
              {
              
      out.write("\n");
      out.write("                  chart1.draw(data, options);\n");
      out.write("              ");

              }
              
      out.write("\n");
      out.write("            }\n");
      out.write("       </script>\n");
      out.write("    </head>     \n");
      out.write("    <body>\n");
      out.write("         <a href=\"../index.jsp\">BACK</a>\n");
      out.write("        <h1> <font color=\"beige\">VIRGINIA SCHOOL INFORMATION TOOL</font></h1>\n");
      out.write("    <form method=\"get\">\n");
      out.write("            <select id=\"sch_year\" name=\"sch_year\">\n");
      out.write("                    <option>2006-2007</option>\n");
      out.write("                    <option>2007-2008</option>\n");
      out.write("                    <option>2008-2009</option>\n");
      out.write("                    <option>2009-2010</option>\n");
      out.write("                    <option>2010-2011</option>\n");
      out.write("                    <option>2011-2012</option>\n");
      out.write("                    <option>2012-2013</option>\n");
      out.write("            </select>\n");
      out.write("            <select id=\"div_num\" name =\"div_num\" onchange=\"update_sch();\">\n");
      out.write("            </select>\n");
      out.write("            <select id=\"sch_num\" name=\"sch_name\">\n");
      out.write("            </select>\n");
      out.write("            <input type=\"Submit\" name=\"submit\" Value=\"Submit\">\n");
      out.write("        </form>\n");
      out.write("        <div id=\"Stats\" class=\"VirginiaStats\"> \n");
      out.write("            Academic Year: ");
      out.print( request.getParameter("sch_year"));
      out.write(" \n");
      out.write("            <br>\n");
      out.write("            Institution: ");
      out.print( request.getParameter("sch_name"));
      out.write("\n");
      out.write("            <br>\n");
      out.write("            Accreditation status: ");
      out.print( SchoolData.selectAccred(request.getParameter("sch_year"), request.getParameter("sch_name")));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");

            String address = request.getParameter("sch_name") + ", VA";
        
      out.write("\n");
      out.write("        <div class=\"picMapContainer\">              \n");
      out.write("            <img id= \"map\" alt=\"Static Map\" src=\"http://maps.google.com/maps/api/staticmap?center=");
      out.print(address);
      out.write("&zoom=18&size=300x300&maptype=hybrid&sensor=false\"></img>\n");
      out.write("        </div>  \n");
      out.write("  <script>\n");
      out.write("    google.setOnLoadCallback(drawMap);\n");
      out.write("\n");
      out.write("    function drawMap() {\n");
      out.write("      var data = google.visualization.arrayToDataTable([\n");
      out.write("        ['Location'],\n");
      out.write("        ['");
      out.print(address);
      out.write("']\n");
      out.write("\n");
      out.write("      ]);\n");
      out.write("\n");
      out.write("    var options = { \n");
      out.write("        showTip: true, \n");
      out.write("        mapType: 'terrain',\n");
      out.write("        zoomLevel: 8\n");
      out.write("        };\n");
      out.write("\n");
      out.write("    var map = new google.visualization.Map(document.getElementById('mapImage'));\n");
      out.write("\n");
      out.write("    map.draw(data, options);\n");
      out.write("  };\n");
      out.write("  \n");
      out.write("            update_div();\n");
      out.write("            update_sch();\n");
      out.write("  </script>\n");
      out.write("  <div id=\"mapImage\" class=\"Map\" style= \"width: 1000px; height: 500px;\"> </div>\n");
      out.write("  <div class='geo' id=\"geo\" style=\"width: 500px; height: 300px;\">  <img src=\"../images/va.gif\" alt=\"County Map\" width=\"500\" height=\"300\" title=\"Credit for this picture goes to http://vaassessors.net/\"></img></div>\n");
      out.write("  <div id = \"chart_div1\" class=\"Sch_cnt\" style = \"width: 400px; height: 400px;\" > </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
