package org.apache.jsp.links;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.SOLdata;
import java.util.*;
import db.*;

public final class trophyPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SOL data Statistics</title>\n");
      out.write("        <link rel= \"stylesheet\" href= \"../stylesheet.css\" /> \n");
      out.write("        <script type=\"text/javascript\" src=\"../divsch.js\"></script>\n");
      out.write("            <link rel =\"stylesheet\" href= \"../theme.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            google.load(\"visualization\", \"1\", {packages: [\"corechart\"]});\n");
      out.write("            google.setOnLoadCallback(drawChart);\n");
      out.write("\n");
      out.write("            function drawChart() {\n");
      out.write("                var data = google.visualization.arrayToDataTable([\n");
      out.write("                ");

                    Graduation.PrintData(request,out);
                
      out.write("\n");
      out.write("                ]);\n");
      out.write("\n");
      out.write("                var options = {\n");
      out.write("                    title: ' ");
      out.print( request.getParameter("sch_name"));
      out.write("' + ' ");
      out.print( request.getParameter("sch_year"));
      out.write("',\n");
      out.write("                    vAxis: {title: 'Graduation Total',\n");
      out.write("                        titleTextStyle: {color: 'Blue'}}\n");
      out.write("                };\n");
      out.write("                var chart1 = new google.visualization.BarChart(document.getElementById('chart_div1'));\n");
      out.write("               \n");
      out.write("              ");
 if(request.getParameter("div_num") != null)
              {
              
      out.write("\n");
      out.write("                  chart1.draw(data, options);\n");
      out.write("              ");

              }
              
      out.write("\n");
      out.write("            }    \n");
      out.write("  </script>      \n");
      out.write("    </head>     \n");
      out.write("    <body>\n");
      out.write("          <a href=\"../index.jsp\">BACK</a>\n");
      out.write("        <h1> <font color=\"beige\">High School Graduate Tool</font></h1>\n");
      out.write("        <form method=\"get\">\n");
      out.write("            <select name = \"sch_year\" value=\"2006-2007\">\n");
      out.write("                <option>2006-2007</option>\n");
      out.write("                <option>2007-2008</option>\n");
      out.write("                <option>2008-2009</option>\n");
      out.write("                <option>2009-2010</option>\n");
      out.write("                <option>2010-2011</option>\n");
      out.write("                <option>2011-2012</option>\n");
      out.write("                <option>2012-2013</option>\n");
      out.write("            </select>\n");
      out.write("            <select id=\"div_num\" name =\"div_num\" onchange=\"update_sch();\">\n");
      out.write("            </select>\n");
      out.write("            <select id=\"sch_num\" name=\"sch_name\">\n");
      out.write("            </select>\n");
      out.write("      <input type=\"Submit\" name=\"submit\" Value=\"Find Similar Schools\">\n");
      out.write("            <br><br><br>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Division Name</td>\n");
      out.write("                    <th>School Name</td>\n");
      out.write("                    <th>Graduation Count</td>\n");
      out.write("                </tr> \n");
      out.write("                ");

                    db.Graduation a = new db.Graduation();
                    String al = null;
                    try {
                        al = a.getSimilar(request.getParameter("div_num"), request.getParameter("sch_year"));
                    } catch (Exception e) {
                    }
                    if (al != null) {
                        String[] to = al.split("#");
                        for (int i = 0; i < to.length; i++) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>    \n");
      out.write("                    <td>");
      out.print(to[i]);
      out.write("</td>");
i++;
      out.write("\n");
      out.write("                    <td>");
      out.print(to[i]);
      out.write("</td>");
i++;
      out.write("\n");
      out.write("                    <td>");
      out.print(to[i]);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                        }
                    }
                
      out.write(" \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <div id=\"visualization\">\n");
      out.write("        </div>    \n");
      out.write("        <script>\n");
      out.write("            update_div();\n");
      out.write("            update_sch();\n");
      out.write("        </script>\n");
      out.write("   <div id = \"chart_div1\" class=\"columnChart\" style = \"width: 800px; height: 400px;\" > </div>\n");
      out.write("   \n");
      out.write("        <div id=\"countyMap\" class=\"countyMapAwardPage\"><img src=\"../images/va.gif\" alt=\"County Map\" width=\"500\" height=\"300\" title=\"Credit for this picture goes to http://vaassessors.net/\"></img></div>\n");
      out.write("    </body>\n");
      out.write(" </html>\n");
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
