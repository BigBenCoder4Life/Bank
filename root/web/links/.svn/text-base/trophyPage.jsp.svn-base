<%@page import= "db.SOLdata"%>
<%@page import= "java.util.*, db.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>High School Graduate Tool</title>
        <link rel= "stylesheet" href= "../stylesheet.css" /> 
        <script type="text/javascript" src="../divsch.js"></script>
            <link rel ="stylesheet" href= "../theme.css" />
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <script type="text/javascript">


            google.load("visualization", "1", {packages: ["corechart"]});
            google.setOnLoadCallback(drawChart);

            function drawChart() {
                var data = google.visualization.arrayToDataTable([
                <%
                    Graduation.PrintData(request,out);
                %>
                ]);

                var options = {
                    title: ' <%= request.getParameter("sch_name")%>' + ' <%= request.getParameter("sch_year")%>',
                    vAxis: {title: 'Graduation Total',
                        titleTextStyle: {color: 'Blue'}}
                };
                var chart1 = new google.visualization.BarChart(document.getElementById('chart_div1'));
               
              <% if(request.getParameter("div_num") != null)
              {
              %>
                  chart1.draw(data, options);
              <%
              }
              %>
            }    
  </script>      
    </head>     
    <body>
               <div class="navbar navbar-inverse">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-inverse-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">The Bank</a>
            </div>
            <div class="navbar-collapse collapse navbar-inverse-collapse">
                <ul class="nav navbar-nav">
                    <!--This is where the buttons are on the left -->
                    <li class="active"><a href="../index.jsp">Home</a></li>
                    <li><a href="trophyPage.jsp">School Comparison Tool </a></li>
                    <li><a href="awardPage.jsp">SOL Data Tool</a></a>
                    <li><a href="virginiaPage2.jsp">School Information Tool</a></a> 
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="tutorial.jsp">Help</a></li>
                </ul>
            </div>
        </div>
        <h1> School Comparison Tool</h1>
        <form method="get">
            <select name = "sch_year" value="2006-2007">
                <option>2006-2007</option>
                <option>2007-2008</option>
                <option>2008-2009</option>
                <option>2009-2010</option>
                <option>2010-2011</option>
                <option>2011-2012</option>
                <option>2012-2013</option>
            </select>
            <select id="div_num" name ="div_num" onchange="update_sch();">
            </select>
            <select id="sch_num" name="sch_name">
            </select>
      <input type="Submit" name="submit" Value="Find Similar Schools">
            <br><br>
            <h2>Schools with similar location types</h2>
            <br>
            <table border="1">
                <tr>
                    <th>Division Name</td>
                    <th>School Name</td>
                </tr> 
                <%
                    db.Graduation a = new db.Graduation();
                    String al = null;
                    try {
                        al = a.getSimilar(request.getParameter("div_num"), request.getParameter("sch_year"));
                    } catch (Exception e) {
                    }
                    if (al != null) {
                        String[] to = al.split("#");
                        for (int i = 0; i < to.length; i++) {
                %>

                <tr>    
                    <td><%=to[i]%></td><%i++;%>
                    <td><%=to[i]%></td>
                </tr>

                <%
                        }
                    }
                %> 
            </table>
            <h2> <% if(request.getParameter("sch_name") != null){%> Diplomas awarded at <%= request.getParameter("sch_name") + " School"%> <br> School Year: <%= request.getParameter("sch_year")%> <% } %></h2>
        </form>
        <div id="visualization">
        </div>    
        <script>
            update_div();
            update_sch();
        </script>
   <div id = "chart_div1" class="barChart" style = "width: 800px; height: 400px;" > </div>
   
        <div id="countyMap" class="countyMapTropyPage"><img src="../images/va.gif" alt="County Map" width="800" height="350" title="Credit for this picture goes to http://vaassessors.net/"></img></div>
    </body>
 </html>
