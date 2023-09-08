package jdbc_demo;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class EmployeeUpdate {
		public static void main(String[] args) {
			String url= "jdbc:mysql://localhost:3306/javabatch";
			String username="root";
			String password="root";
			Connection connection=null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			 connection=DriverManager.getConnection(url, username, password);
				
			Statement statement=connection.createStatement();
			
			int a= statement.executeUpdate("UPDATE employee SET name='saurabh',email='saurbh@gmail.com' WHERE Id= 6");
			if(a>0) {
				System.out.println("All Good");
			}else {
				System.out.println("not good");
			}
			
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}


