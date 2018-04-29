package entity;

import java.sql.*;

public class EmployeeTransaction {

	public static void main(String[] args) {
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/EmpDB","sa","sa@123");
			String str = "delete from Employee where empname = 'raj'";
			Statement st = conn.createStatement();
			st.executeUpdate(str);
			
			System.out.println("Success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
