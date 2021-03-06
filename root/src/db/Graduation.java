package db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;

/*
 * Database connection object for trophyPage.java
 *
 * @author Logan Sandberg, shaikhsf
 */
public class Graduation {
    
    public String school_year;
    public String sch_name;
    public String div_name;
    public int completion_category;
    public String diploma;
    public int completion_count;
    
    /*
    * Default constructor
    */
    public Graduation() throws SQLException {
        
        this.school_year = "Default";
        this.sch_name = "Default";
        this.div_name = "Default";
        this.completion_category = 0;
        this.diploma = "Default";
        this.completion_count = 0;
    } 
    
    /*
    * Query to find similar schools to the ones in the division selected
    *
    * @param division - given school division
    * @throws SQLException
    */
    
    public String getSimilar(String division, String schoolYear) throws SQLException {

        Connection db = Database.open();
        PreparedStatement pst = db.prepareStatement(
                " SELECT DISTINCT div.div_name AS dn, hs_graduate.sch_name AS sn"
                + " FROM div"
                + " JOIN hs_graduate ON hs_graduate.div_name = div.div_name"
                + " WHERE loc_type like ("
                + " SELECT Distinct loc_type "
                + " FROM div "
                + " WHERE div_num =\'" + division + "\')"
                + " AND school_year = \'" + schoolYear + "\'"
                + " AND div.div_num !=  \'" + division + "\'"
                + " AND sch_name IS NOT NULL"
                + " GROUP BY div.div_name, div.loc_type, hs_graduate.sch_name"
                + " ORDER BY div.div_name,  hs_graduate.sch_name"
                + " LIMIT 20;"
        );
                            
        ResultSet rs = pst.executeQuery();
        String to = "";

        if (!rs.next()) {
            throw new IllegalArgumentException("invalid");
        }

        to += (rs.getString("dn") + "#");
        to += (rs.getString("sn") + "#");

        while (rs.next()) {
            to += (rs.getString("dn") + "#");
            to += (rs.getString("sn") + "#");
        }
        
        rs.close();
        db.close();
        pst.close();

        return to;
    }    

	/*
     * Simple query grabs diploma data to be used for the graph
     * request - The request from the http/jsp page.
     * output - The output stream for html/jsp page.
     */
   
    public static void PrintData(HttpServletRequest request, JspWriter output) throws SQLException, IOException {

        String sch_name = request.getParameter("sch_name");
        String sch_year = request.getParameter("sch_year");
        int total = 0;
        String sql;                     //Holds string for sql query.
        PreparedStatement st;           //Statment object for postgresql.
        ResultSet rs;                   //The result set for the query.
        Connection db = Database.open(); //Open a connection. 
        
       sql = "SELECT school_year,hs_completion_name, SUM(hs_completer_cnt) AS  total_students_awarded " +
                    "FROM hs_graduate " +
                    "WHERE sch_name = ?"+
                    "  AND school_year = ?" +
                    "  AND sch_name IS NOT NULL" +
                    "  AND school_year IS NOT NULL" +
                    "  AND div_name IS NOT NULL" +
                    "  AND div_num IS NOT NULL" +
                    "  AND sch_num IS NOT NULL" +
                    "  AND gender IS  NOT NULL" +
                    "  AND lep_flag IS NULL" +
                    "  AND disability_flag IS NULL" +
                    "  AND federal_race_code IS NULL" +
                    "  AND disadvantaged_flag IS NULL" +
                    "  AND disability_flag IS NULL " +
                    "GROUP BY  school_year,hs_completion_name, sch_name " +
                    "ORDER BY school_year;";

        st = db.prepareStatement(sql);
        
        st.setString(1, sch_name);
        st.setString(2, sch_year);
      
        rs = st.executeQuery();
        
       output.println("['Diploma', 'Completion Count'],");

           while (rs.next()) {
            
            String type = rs.getString(2);
            int cnt = rs.getInt(3);
            total += cnt;
            
            String line = String.format("['%s',%s],", type, cnt);

            output.println(line);
          
        }

        output.println("['Total Graduates'," + total + "]");
        
        st.close();
        db.close();
        rs.close();
    }
}