package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password = "root";
		String sql = "INSERT INTO student VAlUES(9,'shubham','shubham@mail.com')";
		String sql2 = "DELETE FROM student WHERE Id=3";
		//to load / register 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//to establish connection
			
			Connection connection = DriverManager.getConnection(url, username, password);
		
		    //to create a statement
			
			Statement statement = connection.createStatement();
			
			// to execute the statement
			
			statement.execute(sql);
			statement.execute(sql2);
			
			//connection close
			
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
