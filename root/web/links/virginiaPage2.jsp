<%-- 
    Document   : VirginiaPage
    Created on : Mar 26, 2014, 5:38:58 PM
    Author     : kirtlepb
--%>
<%@page import= "java.util.*, db.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <%--Google map section--%>       
        <script
            src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDY0kkJiTPVd2U7aTOAwhc9ySH6oHxOIYM&sensor=false">
        </script>
        <%--Google map section--%>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Virginia Statistics</title>
        <link rel= "stylesheet" href= "../stylesheet.css" />  
        <link rel ="stylesheet" href= "../theme.css" />
        <!--Load the AJAX API-->
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <script type="text/javascript" src="../divsch.js"></script>
        <script>
            // Load the Visualization API and the piechart package.
            google.load('visualization', '1.0', {'packages': ['corechart', 'map']});
                  
            google.setOnLoadCallback(drawChart);

            function drawChart() {
                var data = google.visualization.arrayToDataTable([
                <%
                    SchoolData.PrintVirginiaData(request,out);
                %>
                ]);

                var options = {
                    title: ' <%= request.getParameter("sch_year")%>',
                    vAxis: {title: 'Virginia School Counts',
                        titleTextStyle: {color: 'red'}}
                };
                var chart1 = new google.visualization.BarChart(document.getElementById('chart_div1'));
               
              <% if(request.getParameter("sch_year") != null)
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
        <h1> VIRGINIA SCHOOL INFORMATION TOOL</h1>
    <form method="get">
            <select id="sch_year" name="sch_year">
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
            <input type="Submit" name="submit" Value="Submit">
        </form>
        <div id="Stats" class="VirginiaStats" style="font-size:40px;"> 
            Academic Year: 
              <% if(request.getParameter("sch_year") != null){%>
              <%= request.getParameter("sch_year")%>
              <%}%>
            <br>
            Institution:   
              <% if(request.getParameter("sch_name") != null){%>
              <%= request.getParameter("sch_name")%>
              <%}%>
            <br>
            Accreditation status: <%= SchoolData.selectAccred(request.getParameter("sch_year"), request.getParameter("sch_name"))%>
        </div>
        <%
            String address = request.getParameter("sch_name") + ", VA";
        %>
        <div class="picMapContainer">              
            <img id= "map" alt="Static Map" src="http://maps.google.com/maps/api/staticmap?center=<%=address%>&zoom=18&size=300x300&maptype=hybrid&sensor=false" ></img>
        </div>  
  <script>
    google.setOnLoadCallback(drawMap);

    function drawMap() {
      var data = google.visualization.arrayToDataTable([
        ['Location'],
        ['<%=address%>']

      ]);

    var options = { 
        showTip: true, 
        mapType: 'terrain',
        zoomLevel: 8
        };

    var map = new google.visualization.Map(document.getElementById('mapImage'));

    map.draw(data, options);
  };
  
            update_div();
            update_sch();
  </script>
  <div id="mapImage" class="Map" style= "width: 1000px; height: 500px;"> </div>
  <div id="countyMap" class="CountyMap"> <img src="../images/va.gif" alt="County Map" width="800" height="400" title="Credit for this picture goes to http://vaassessors.net/"></img> </div>

  
  <div id = "chart_div1" class="Sch_Cnt" style = "width: 600px; height: 315px;" > </div>
    </body>
</html>


