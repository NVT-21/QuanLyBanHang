package database;

import java.sql.*;
import java.sql.DriverManager;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection c = null;
		
		try {
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			
			String url = "jdbc:mySQL://localhost:3306/quanlybanhang";
			String username = "root";
			String password = "";
			
			
			c = DriverManager.getConnection(url, username, password);
			if(c!=null)
			{
				System.out.println(" success");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}
	
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
