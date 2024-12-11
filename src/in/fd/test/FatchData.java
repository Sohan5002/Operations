package in.fd.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FatchData {
	 public static void main(String[] args) throws Exception {
	      
	     Class.forName("com.mysql.cj.jdbc.Driver");

	        // Establish connection
	        Connection connection = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/operation_db", 
	            "root", 
	            "Suneel@22#"
	        );
	        PreparedStatement ps = connection.prepareStatement("select * from register");
	        ResultSet rs= ps.executeQuery();
	        while(rs.next())
	        {
	        	String name1=rs.getString("name");
	        	System.out.print("Name: "+name1);
	        	String email1 =rs.getString("email");
	        	System.out.println("Email:" +email1);
	        	String password =rs .getString("password");
	        	System.out.println("password :" +password);
	        	String gender1 =rs.getString("gender");
	        	System.out.println("Gender :" +gender1);
	        	String city1=rs.getString("city");
	        	System.out.println("City :"+city1);
	        }
	    
	 }

	 
	 
}