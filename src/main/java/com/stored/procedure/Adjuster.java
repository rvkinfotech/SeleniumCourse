package com.stored.procedure;
import java.sql.*;

public class Adjuster {
 
	public static void raiseSalary (int empNo, float percent)
  throws SQLException, ClassNotFoundException {
	  Class.forName("oracle.jdbc.driver.OracleDriver");  
	  
	//step2 create  the connection object  
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.108:1521:orcl","PLSQLUSER","PLSQLUSER");  
	
    String sql = "UPDATE employees SET salary = salary * ? WHERE employee_id = ?";
    try {
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setFloat(1, (1 + percent / 100));
      pstmt.setInt(2, empNo);
      pstmt.executeUpdate();
      pstmt.close();
    } catch (SQLException e)
          {System.err.println(e.getMessage());}
    }
	public static void main(String[] args) {
		
		try {
    	Adjuster.raiseSalary(100,90.0f);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

// SELECT dbms_java.longname(object_name) FROM user_objects WHERE object_type = 'JAVA SOURCE';