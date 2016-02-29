

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Test{

private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/jdbc_crud";
private static final String DB_USER = "root";
private static final String DB_PASSWORD = "root";
public	 Connection con;
public   Statement stmt;
public String data="";

	public String retrieve(){
		
		try{
			con=getDBConnection();
	         stmt = con.createStatement();
	         String query="Select * from employe";
	         ResultSet rs = stmt.executeQuery(query);
	         while (rs.next()) {
//	        	 data=data.concat("{'employees':[{'name':"+rs.getString("name")+",'Address':"+rs.getString("address")+"}]}");
	        	 data=data.concat("[{\"name\":'"+rs.getString("name")+"',\"Address\":'"+rs.getString("address")+"'}]");
	         }
	         
	       
	        		 
	         System.out.println("Created DB Connection");
	        return data;	
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	        return data;
	    }
			
		
	}
	
		
	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
                               DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

}