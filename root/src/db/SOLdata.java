package db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//These two imports are used for JSPWriter so that information can be passed back and forth from JSP to Java files
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;

/*
 * Object to hold school sol_data
 * @author shaikhsf
 */
public class SOLdata {
    public String school_year;
    public String sch_name;
    public String test;
    public double avg_sol;
    public double pass_adv;
    public double pass_prof_rate;
    public double pass_rate;
    public double fail_rate;
    //Constructor that initialize the variables
    public SOLdata() throws SQLException {
        this.school_year = "Default";
        this.sch_name = "Default";
        this.test = "Default";
        this.avg_sol = 0.0;
        this.pass_adv = 0.0;
        this.pass_prof_rate = 0.0;
        this.pass_rate = 0.0;
        this.fail_rate = 0.0;
    }

    /*
     * Simple query 
     *
     *@param school_year - The school year.
     * @param sch_name - The school name.
     * @param avg-sol - The average sol test score.
     * @param pass_adv - The pass advanced rate.
     * @param pass_prof_rate - The pass profiecient rate.
     * @param pass_rate - The pass rate.
     * @param fail_rate - The fail rate.
     */
    public SOLdata(String school_year, String sch_name, String test, double avg_sol, double pass_adv, double pass_prof_rate, double pass_rate, double fail_rate) {
        this.sch_name = sch_name;
        this.test = test;
        this.avg_sol = avg_sol;
        this.pass_adv = pass_adv;
        this.pass_prof_rate = pass_prof_rate;
        this.pass_rate = pass_rate;
        this.fail_rate = fail_rate;
    }

    /*
     * Simple qeury
     * request - The request from the http/jsp page.
     * output - The output stream for html/jsp page.
     */
   
    public static void PrintData(HttpServletRequest request, JspWriter output) throws SQLException, IOException {

        String sch_year = request.getParameter("sch_year");
        String div_num  = request.getParameter("div_num");
        String sch_name = request.getParameter("sch_name");
        int div_numInt;
        
        if(div_num == null)
            div_numInt = Integer.parseInt("001");
        else
            div_numInt = Integer.parseInt(div_num);

        String sql;                     //Holds string for sql query.
        PreparedStatement st;           //Statment object for postgresql.
        ResultSet rs;                   //The result set for the query.
        Connection db = Database.open(); //Open a connection. 

        sql = "SELECT test, pass_rate, fail_rate, pass_prof_rate, pass_advanced_rate\n" +
                "FROM sol_test_data\n" +
                "WHERE school_year = ?" +
                "  AND div_num = ?" +
                "  AND sch_name = ?" +
                "  AND federal_race_code IS NULL" +
                "  AND gender IS NULL" +
                "  AND disability_flag IS NULL" +
                "  AND lep_flag IS NULL" +
                "  AND disadvantaged_flag IS NULL" +
                "  AND test_level IS NULL" +
                "  AND test IS NOT NULL" +
                " ORDER BY test,pass_rate, fail_rate,pass_prof_rate,pass_advanced_rate ";

        st = db.prepareStatement(sql);
        
        st.setString(1, sch_year);
        st.setInt(2, div_numInt);
        st.setString(3, sch_name);

        rs = st.executeQuery();
        
        output.print("['test','passRate','failRate','pass_prof','pass_adv'],");

        while (rs.next()) {
        
            String test = rs.getString(1);
            double pass = rs.getDouble(2);
            double fail = rs.getDouble(3);
            double pass_prof = rs.getDouble(4);
            double pass_adv = rs.getDouble(5);
            
            String line = String.format("['%s',%s,%s,%s,%s],", test, pass, fail, pass_prof, pass_adv);

            output.print(line);
          
        }

        st.close();
        db.close();
        rs.close();
    }
  
    /*
     * Testing method for debugging.
     */
     public static void PrintDataMainTest() throws SQLException, IOException {

        String sql;                     //Holds string for sql query.
        PreparedStatement st;           //Statment object for postgresql.
        ResultSet rs;                   //The result set for the query.
        Connection db = Database.open(); //Open a connection. 

            sql = "SELECT test, pass_rate, fail_rate, pass_prof_rate, pass_advanced_rate\n" +
                "FROM sol_test_data\n" +
                "WHERE true\n" +
                "  AND school_year = '2006-2007'\n" +
                "  AND div_num = '001'\n" +
                "  AND sch_num = '0070'\n" +
                "  AND federal_race_code IS NULL\n" +
                "  AND gender IS NULL\n" +
                "  AND disability_flag IS NULL\n" +
                "  AND lep_flag IS NULL\n" +
                "  AND disadvantaged_flag IS NULL\n" +
                "  AND test_level IS NULL\n" +
                "  AND test IS NOT NULL\n" +
                "ORDER BY test,pass_rate, fail_rate,pass_prof_rate,pass_advanced_rate ";

        st = db.prepareStatement(sql);
        rs = st.executeQuery();

       System.out.println("['test','passRate','failRate','pass_prof','pass_adv']");

        while (rs.next()) {
            
            String test = rs.getString(1);
            double pass = rs.getDouble(2);
            double fail = rs.getDouble(3);
            double pass_prof = rs.getDouble(4);
            double pass_adv = rs.getDouble(5);
            
            String line = String.format("['%s',%s,%s,%s,%s],", test, pass, fail,pass_prof,pass_adv);

            System.out.println(line);
        }

        st.close();
        db.close();
        rs.close();
    }
}

 
