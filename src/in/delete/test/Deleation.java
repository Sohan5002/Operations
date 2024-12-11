package in.delete.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deleation {

  public static void main(String[] args) throws Exception {
        // Load MySQL JDBC Driver
    	 //String name1="mohan";
    	  String email1="mohan123@gmail.com";
    	 // String password="mo123"; 
    	 // String gender1="male";
    	  //String city ="bhopal";
    	  
    	
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/operation_db", 
            "root", 
            "Suneel@22#"
        );
        PreparedStatement ps = connection.prepareStatement("DELETE   from register WHERE email=?");
    
   // ps.setString(2,pass1);
   // ps.setString(1, password);
    ps.setString(1,email1);
   // ps.setString(1, name1);
    //ps.setString(5,city);
    //ps.setString(4, gender1);
    int i= ps.executeUpdate();
    if(i>0)
    {
   	 System.out.print("updated succesful");
   	 
    }
    else
    {
   	 System.out.print("fail");
    }
    connection.close();
}
}
