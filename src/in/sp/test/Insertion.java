
package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) throws Exception {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/operation_db", 
            "root", 
            "Suneel@22#"
        );

        // Use Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name1 = scanner.nextLine();

        System.out.println("Enter email:");
        String email1 = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        System.out.println("Enter gender:");
        String gender1 = scanner.nextLine();

        System.out.println("Enter city:");
        String city = scanner.nextLine();

        // Prepare the SQL query using placeholders
        PreparedStatement ps = connection.prepareStatement("INSERT INTO register VALUES (?, ?, ?, ?, ?)");
        ps.setString(1, name1);
        ps.setString(2, email1);
        ps.setString(3, password);
        ps.setString(4, gender1);
        ps.setString(5, city);

        // Execute the query
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println("Data inserted successfully.");
        } else {
            System.out.println("Insertion failed.");
        }

        // Close resources
        ps.close();
        connection.close();
        scanner.close();
    }
}


/*package in.sp.test;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

//import com.mysql.cj.jdbc.JdbcPreparedStatement;

import java.sql.Connection;

public class Insertion {
    public static void main(String[] args) throws Exception {
        // Load MySQL JDBC Driver
    	 String name1="mohan";
    	  String email1="mohan123@gmail.com";
    	  String password="moohan`123"; 
    	  String gender1="male";
    	  String city ="bhopal";
    	  
    	
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/operation_db", 
            "root", 
            "Suneel@22#"
        );
        //PreparedStatement ps=  connection.prepareStatement("insert into register values ('"+name1+"','"+email1+"','"+pass1+"','"+gender1+"' ,'"+city+"')");
        // PreparedStatement ps=  connection.prepareStatement("insert into register values ('rohan','rohan123@gmail.com','rohan123','male' ,'pune')"); 
        PreparedStatement ps=  connection.prepareStatement("insert into register values (?,?,?,?,?)");
        ps.setString(1, name1);
        ps.setString(2, email1);
        ps.setString(3, password);
        ps.setString(4, gender1);
        ps.setString(5,city);
        
        int i= ps.executeUpdate();
         if(i>0)
         {
        	 System.out.print("success");
        	 
         }
         else
         {
        	 System.out.print("fail");
         }
         connection.close();
    }
}
 */
