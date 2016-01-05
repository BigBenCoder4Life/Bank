package org.apache.jsp.links;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import db.*;

public final class Temporary_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            // Load the Visualization API and the piechart package.\n");
      out.write("            google.load('visualization', '1.0', {'packages': ['corechart', 'map']});\n");
      out.write("\n");
      out.write("            // Set a callback to run when the Google Visualization API is loaded.\n");
      out.write("            google.setOnLoadCallback(drawChart);\n");
      out.write("            google.setOnLoadCallback(drawChartGuages);\n");
      out.write("\n");
      out.write("            // Callback that creates and populates a data table,\n");
      out.write("            // instantiates the pie chart, passes in the data and\n");
      out.write("            // draws it.    \n");
      out.write("            function drawChart() {\n");
      out.write("                \n");
      out.write("                var data = google.visualization.arrayToDataTable([\n");
      out.write("             ['test', 'Pass Rate', 'Fail Rate', 'Pass Proficiency Rate', 'Advanced Pass Rate'], \n");
      out.write("            ");

               SOLdata.PrintData(request, out); 
            
      out.write("\n");
      out.write("                ]);\n");
      out.write("\n");
      out.write("                // Set chart options\n");
      out.write("                var options = {'title': 'Test:' + ' ");
      out.print( request.getParameter("subject"));
      out.write("',\n");
      out.write("                    vAxis: {title: 'SOL data',  titleTextStyle: {color: 'red'}}\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                // Instantiate and draw our chart, passing in some options.\n");
      out.write("                var chart = new google.visualization.BarChart(document.getElementById('chart_div'));\n");
      out.write("                chart.draw(data, options);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>     \n");
      out.write("    <body onload=\"initialize()\">\n");
      out.write("        <h1> <font color=\"beige\">VIRGINIA ACCREDITATION STATISTICS TOOL</font></h1>\n");
      out.write("        <form name =\"form1\" method=\"get\">\n");
      out.write("            <select name=\"div_name\">\n");
      out.write("                ");

                    for (String div_name : SchoolData.selectDivNames()) {
                        out.print("<option>" + div_name + "</option>");
                    }
                
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" value=\"Select County\">\n");
      out.write("        </form>\n");
      out.write("        <form name= \"form2\" method=\"get\">\n");
      out.write("            <select id=\"address\" name=\"sch_year\">\n");
      out.write("                ");

                    for (String sch_year : SchoolData.SelectYear()) {
                        out.print("<option>" + sch_year + "</option>");
                    }
                
      out.write("\n");
      out.write("            </select> \n");
      out.write("            <select name=\"sch_name\">       \n");
      out.write("                ");

                    for (String sch_name : SchoolData.selectSchNames(request.getParameter("div_name"))) {
                        out.print("<option>" + sch_name + " </option>");
                    }
                
      out.write("\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <select name=\"subject\">\n");
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
      out.write("                <optgroup label=\"ENGLISH\">\n");
      out.write("                    <option value=\"English Reading\" >English Reading</option>\n");
      out.write("                    <option value=\"English Writing\" >English Writing</option>\n");
      out.write("                    <option value=\"Writing\" >Writing</option>\n");
      out.write("                </optgroup>\n");
      out.write("                <optgroup label=\"SCIENCE\">\n");
      out.write("                    <option value=\"Science\"  >Science</option>\n");
      out.write("                    <option value=\"Earth Science\" >Earth Science</option>\n");
      out.write("                    <option value=\"Biology\" >Biology</option>\n");
      out.write("                    <option value=\"Geography\" >Geography</option>\n");
      out.write("                    <option value=\"Chemistry\" >Chemistry</option>\n");
      out.write("                </optgroup>\n");
      out.write("            </select>\n");
      out.write("            <input id=\"address\" type=\"submit\" value=\"Submit\">\n");
      out.write("        </form>   \n");
      out.write("        <!--Div that will hold the pie chart-->\n");
      out.write("        <div id=\"chart_div\" class=\"VirginiaChart\"></div>\n");
      out.write("\n");
      out.write("        <div id=\"Stats\" class=\"VirginiaStats\"> \n");
      out.write("            Academic Year: ");
      out.print( request.getParameter("sch_year"));
      out.write(" \n");
      out.write("            <br>\n");
      out.write("            Institution: ");
      out.print( request.getParameter("sch_name"));
      out.write("\n");
      out.write("            <br>\n");
      out.write("            Subject: ");
      out.print( request.getParameter("subject"));
      out.write("\n");
      out.write("            <br>\n");
      out.write("            Accreditation status: ");
      out.print( SchoolData.selectAccred(request.getParameter("sch_year"), request.getParameter("sch_name")));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");

            String address = request.getParameter("sch_name") + ", VA";
        
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
