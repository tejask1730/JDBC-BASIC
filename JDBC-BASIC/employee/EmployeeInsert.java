package jdbc_demo;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class EmployeeInsert {
		public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306/javabatch";
			String username="root";
			String password="root";
			String sql="INSERT INTO employee VALUES(3,'ma','ma@mail.com') ";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection connection = DriverManager.getConnection(url, username, password);
				
				Statement statement= connection.createStatement();
				
				//4:execute the statement
				statement.execute(sql);
				
				//5: close connection
				connection.close();
				
				System.out.println("all  good");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}


