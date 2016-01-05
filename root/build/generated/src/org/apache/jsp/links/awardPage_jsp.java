package org.apache.jsp.links;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.SOLdata;
import java.util.*;
import db.*;

public final class awardPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel= \"stylesheet\" href= \"../stylesheet.css\" />\n");
      out.write("        <link rel =\"stylesheet\" href= \"../theme.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"../divsch.js\"></script>\n");
      out.write("\n");
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

                    SOLdata.PrintData(request,out);
                
      out.write("\n");
      out.write("                ]);\n");
      out.write("\n");
      out.write("                var options = {\n");
      out.write("                    title: ' ");
      out.print( request.getParameter("sch_name"));
      out.write("' + ' ");
      out.print( request.getParameter("sch_year"));
      out.write("',\n");
      out.write("                    vAxis: {title: 'PERCENTAGE',\n");
      out.write("                        titleTextStyle: {color: 'red'}}\n");
      out.write("                };\n");
      out.write("                var chart1 = new google.visualization.ColumnChart(document.getElementById('chart_div1'));\n");
      out.write("               \n");
      out.write("              ");
 if(request.getParameter("div_num") != null)
              {
              
      out.write("\n");
      out.write("                  chart1.draw(data, options);\n");
      out.write("              ");

              }
              
      out.write("\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            // Set a callback to run when the Google Visualization API is loaded.\n");
      out.write("            google.setOnLoadCallback(drawChart2);\n");
      out.write("\n");
      out.write("            function drawChart2() {\n");
      out.write("                \n");
      out.write("                var data = google.visualization.arrayToDataTable([\n");
      out.write("            ");

                SchoolData.PrintData(request, out);
                //     ['TEST 1', 86.04,13.96],
                //     ['TEST 2',94.56,5.44],
                //     ['TEST 3',87.58,12.42],
                //     ['TEST 4',88.26,11.74],
                //     ['TEST 5',97.72,2.28],
                //     ['TEST 6',84.74,15.26],
                //     ['TEST 7',88.06,11.94],  
            
      out.write("\n");
      out.write("                ]);\n");
      out.write("\n");
      out.write("                // Set chart options\n");
      out.write("                var options = {'title': 'Test:' + ' ");
      out.print( request.getParameter("subject"));
      out.write("',\n");
      out.write("                    'width': 500,\n");
      out.write("                    'height': 500,\n");
      out.write("                    colors: ['#228b22', '#FF0000'],\n");
      out.write("                    is3D: true,\n");
      out.write("                    pieSliceText: 'label',\n");
      out.write("                    slices: {1: {offset: 0.2}},\n");
      out.write("                    pieStartAngle: 100,\n");
      out.write("                    backgroundColor: '#A4A4A4'\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                // Instantiate and draw our chart, passing in some options.\n");
      out.write("                var chart2 = new google.visualization.PieChart(document.getElementById('chart_div2'));\n");
      out.write("                \n");
      out.write("                chart2.draw(data, options);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("     </script>      \n");
      out.write("    </head>     \n");
      out.write("    <body>\n");
      out.write("          <a href=\"../index.jsp\">BACK</a>\n");
      out.write("        <h1> <font color=\"beige\">SOL DATA STATISTICS TOOL</font></h1>\n");
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
      out.write("            <select name=\"subject\">\n");
      out.write("                <optgroup label=\"ENGLISH\">\n");
      out.write("                    <option value=\"English Reading\" >English Reading</option>\n");
      out.write("                    <option value=\"English Writing\" >English Writing</option>\n");
      out.write("                    <option value=\"Writing\" >Writing</option>\n");
      out.write("                </optgroup>\n");
      out.write("                <optgroup label=\"HISTORY\">\n");
      out.write("                    <option value=\"History\" >History</option>\n");
      out.write("                    <option value=\"US History I\" >History I</option>\n");
      out.write("                    <option value=\"US History II\" >History II</option>\n");
      out.write("                    <option value=\"VA & US History\" >VA & US History</option>\n");
      out.write("                    <option value=\"VA Studies\" >Va Studies</option>\n");
      out.write("                    <option value=\"Civics & Econ\" >Civics & Econ</option>\n");
      out.write("                </optgroup>\n");
      out.write("                <optgroup label=\"MATH\">\n");
      out.write("                    <option value=\"Mathematics\" >Mathematics</option>\n");
      out.write("                    <option value=\"Geometry\" >Geometry</option>\n");
      out.write("                    <option value=\"Algebra I\" >Algebra I</option>\n");
      out.write("                    <option value=\"Algebra II\" >Algebra II</option>\n");
      out.write("                </optgroup>\n");
      out.write("                <optgroup label=\"SCIENCE\">\n");
      out.write("                    <option value=\"Science\"  >Science</option>\n");
      out.write("                    <option value=\"Earth Science\" >Earth Science</option>\n");
      out.write("                    <option value=\"Biology\" >Biology</option>\n");
      out.write("                    <option value=\"Geography\" >Geography</option>\n");
      out.write("                    <option value=\"Chemistry\" >Chemistry</option>\n");
      out.write("                </optgroup>\n");
      out.write("            </select>\n");
      out.write("            <input type=\"Submit\" name=\"submit\" Value=\"Submit\" onsubmit=\"drawChart()\" onsubmit=\"drawChart2()\">\n");
      out.write("        </form>\n");
      out.write("        <div id=\"visualization\">\n");
      out.write("        </div>    \n");
      out.write("        <script>\n");
      out.write("            update_div();\n");
      out.write("            update_sch();\n");
      out.write("        </script>\n");
      out.write("   <div id = \"chart_div1\" class=\"columnChart\" style = \"width: 1800px; height: 400px;\" > </div>\n");
      out.write("   \n");
      out.write("        <!--Div that will hold the pie chart-->\n");
      out.write("        <div id=\"chart_div2\" class=\"VirginiaChart\"></div>\n");
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
