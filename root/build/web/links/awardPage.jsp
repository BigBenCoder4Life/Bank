<%@page import= "db.SOLdata"%>
<%@page import= "java.util.*, db.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SOL data Statistics</title>
        <link rel= "stylesheet" href= "../stylesheet.css" />
        <link rel ="stylesheet" href= "../theme.css" />
        <script type="text/javascript" src="../divsch.js"></script>

        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <script type="text/javascript">


            google.load("visualization", "1", {packages: ["corechart"]});
            google.setOnLoadCallback(drawChart);

            function drawChart() {
                var data = google.visualization.arrayToDataTable([
                <%
                    SOLdata.PrintData(request,out);
                %>
                ]);

                var options = {
                    title: ' <%= request.getParameter("sch_name")%>' + ' <%= request.getParameter("sch_year")%>',
                    vAxis: {title: 'PERCENTAGE',
                        titleTextStyle: {color: 'red'}}
                };
                var chart1 = new google.visualization.ColumnChart(document.getElementById('chart_div1'));
               
              <% if(request.getParameter("div_num") != null)
              {
              %>
                  chart1.draw(data, options);
              <%
              }
              %>
            }
           
            
            

            // Set a callback to run when the Google Visualization API is loaded.
            google.setOnLoadCallback(drawChart2);

            function drawChart2() {
                
                var data = google.visualization.arrayToDataTable([
            <%
                SchoolData.PrintData(request, out);
                //     ['TEST 1', 86.04,13.96],
                //     ['TEST 2',94.56,5.44],
                //     ['TEST 3',87.58,12.42],
                //     ['TEST 4',88.26,11.74],
                //     ['TEST 5',97.72,2.28],
                //     ['TEST 6',84.74,15.26],
                //     ['TEST 7',88.06,11.94],  
            %>
                ]);

                // Set chart options
                var options = {'title': 'Test:' + ' <%= request.getParameter("subject")%>',
                    'width': 500,
                    'height': 500,
                    colors: ['#228b22', '#FF0000'],
                    is3D: true,
                    pieSliceText: 'label',
                    slices: {1: {offset: 0.2}},
                    pieStartAngle: 100,
                    backgroundColor: '#A4A4A4'
                };

                // Instantiate and draw our chart, passing in some options.
                var chart2 = new google.visualization.PieChart(document.getElementById('chart_div2'));
                
                chart2.draw(data, options);
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
        <h1> SOL DATA STATISTICS TOOL</h1>
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
            <select name="subject">
                <optgroup label="ENGLISH">
                    <option value="English Reading" >English Reading</option>
                    <option value="Writing" >Writing</option>
                </optgroup>
                <optgroup label="HISTORY">
                    <option value="History" >History</option>
                    <option value="US History I" >History I</option>
                    <option value="US History II" >History II</option>
                    <option value="World History I"> World History I</option>
                    <option value="World History II"> World History II</option>
                    <option value="VA & US History" >VA & US History</option>
                    <option value="VA Studies" >VA Studies</option>
                    <option value="Civics & Econ" >Civics & Econ</option>
                </optgroup>
                <optgroup label="MATH">
                    <option value="Mathematics" >Mathematics</option>
                    <option value="Geometry" >Geometry</option>
                    <option value="Algebra I" >Algebra I</option>
                    <option value="Algebra II" >Algebra II</option>
                </optgroup>
                <optgroup label="SCIENCE">
                    <option value="Science"  >Science</option>
                    <option value="Earth Science" >Earth Science</option>
                    <option value="Biology" >Biology</option>
                    <option value="Geography" >Geography</option>
                    <option value="Chemistry" >Chemistry</option>
                </optgroup>
            </select>
            <input type="Submit" name="submit" Value="Submit" onsubmit="drawChart()" onsubmit="drawChart2()">
        </form>
        <div id="visualization">
        </div>    
        <script>
            update_div();
            update_sch();
        </script>
   <div id = "chart_div1" class="columnChart" style = "width: 1800px; height: 400px;" > </div>
   
        <!--Div that will hold the pie chart-->
        <div id="chart_div2" class="VirginiaChart"></div>
        <div id="countyMap" class="countyMapAwardPage"><img src="../images/va.gif" alt="County Map" width="1000" height="400" title="Credit for this picture goes to http://vaassessors.net/"></img></div>
    </body>
 </html>
