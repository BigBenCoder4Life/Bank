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

        <!--Load the AJAX API-->
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <script type="text/javascript">

            // Load the Visualization API and the piechart package.
            google.load('visualization', '1.0', {'packages': ['corechart', 'map']});

            // Set a callback to run when the Google Visualization API is loaded.
            google.setOnLoadCallback(drawChart);
            google.setOnLoadCallback(drawChartGuages);

            // Callback that creates and populates a data table,
            // instantiates the pie chart, passes in the data and
            // draws it.    
            function drawChart() {
                
                var data = google.visualization.arrayToDataTable([
             ['test', 'Pass Rate', 'Fail Rate', 'Pass Proficiency Rate', 'Advanced Pass Rate'], 
            <%
               SOLdata.PrintData(request, out); 
            %>
                ]);

                // Set chart options
                var options = {'title': 'Test:' + ' <%= request.getParameter("subject")%>',
                    vAxis: {title: 'SOL data',  titleTextStyle: {color: 'red'}}
                };

                // Instantiate and draw our chart, passing in some options.
                var chart = new google.visualization.BarChart(document.getElementById('chart_div'));
                chart.draw(data, options);
            }

        </script>
    </head>     
    <body onload="initialize()">
        <h1> <font color="beige">VIRGINIA ACCREDITATION STATISTICS TOOL</font></h1>
        <form name ="form1" method="get">
            <select name="div_name">
                <%
                    for (String div_name : SchoolData.selectDivNames()) {
                        out.print("<option>" + div_name + "</option>");
                    }
                %>
            </select>
            <input type="submit" value="Select County">
        </form>
        <form name= "form2" method="get">
            <select id="address" name="sch_year">
                <%
                    for (String sch_year : SchoolData.SelectYear()) {
                        out.print("<option>" + sch_year + "</option>");
                    }
                %>
            </select> 
            <select name="sch_name">       
                <%
                    for (String sch_name : SchoolData.selectSchNames(request.getParameter("div_name"))) {
                        out.print("<option>" + sch_name + " </option>");
                    }
                %>
            </select>

            <select name="subject">
                <optgroup label="HISTORY">
                    <option value="History" >History</option>
                    <option value="US History I" >History I</option>
                    <option value="US History II" >History II</option>
                    <option value="VA & US History" >VA & US History</option>
                    <option value="VA Studies" >Va Studies</option>
                    <option value="Civics & Econ" >Civics & Econ</option>
                </optgroup>
                <optgroup label="MATH">
                    <option value="Mathematics" >Mathematics</option>
                    <option value="Geometry" >Geometry</option>
                    <option value="Algebra I" >Algebra I</option>
                    <option value="Algebra II" >Algebra II</option>
                </optgroup>
                <optgroup label="ENGLISH">
                    <option value="English Reading" >English Reading</option>
                    <option value="English Writing" >English Writing</option>
                    <option value="Writing" >Writing</option>
                </optgroup>
                <optgroup label="SCIENCE">
                    <option value="Science"  >Science</option>
                    <option value="Earth Science" >Earth Science</option>
                    <option value="Biology" >Biology</option>
                    <option value="Geography" >Geography</option>
                    <option value="Chemistry" >Chemistry</option>
                </optgroup>
            </select>
            <input id="address" type="submit" value="Submit">
        </form>   
        <!--Div that will hold the pie chart-->
        <div id="chart_div" class="VirginiaChart"></div>

        <div id="Stats" class="VirginiaStats"> 
            Academic Year: <%= request.getParameter("sch_year")%> 
            <br>
            Institution: <%= request.getParameter("sch_name")%>
            <br>
            Subject: <%= request.getParameter("subject")%>
            <br>
            Accreditation status: <%= SchoolData.selectAccred(request.getParameter("sch_year"), request.getParameter("sch_name"))%>
        </div>
        <%
            String address = request.getParameter("sch_name") + ", VA";
        %>
    </body>
</html>
