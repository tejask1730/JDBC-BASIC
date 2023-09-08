package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {
	
	HelperClass helperClass = new HelperClass();
	Connection connection=null;
	//to fetch student data
	public Student getStudent(Student student) {
	connection =helperClass.getConnection();
	String sql="SELECT * FROM student";
	try {
	PreparedStatement preparedStatement	=connection.prepareStatement(sql);
	ResultSet resultset = preparedStatement.executeQuery();
	while(resultset.next()) {
		System.out.println(resultset.getInt(1));
		System.out.println(resultset.getString(2));
		System.out.println(resultset.getString(3));
		System.out.println("=========================");
	}
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
	return student;
	}
	
	//to update a student data 
	public int updateStudentById(int id) {
		connection=helperClass.getConnection();
		String sql="UPDATE student SET name='TEJAS' , email= 'tejas@mail.com' WHERE Id=?";
		try {
	        PreparedStatement preparedStatement=connection.prepareStatement(sql);
	        preparedStatement.setInt(1, id);
	        int b=preparedStatement.executeUpdate();
	        if(b>0) {
	        	return id ;
	        }
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
           return -1;
	}
	
	//to delete a student data
	public boolean deleteStudentById(int id) {
		connection=helperClass.getConnection();
		String sql="DELETE FROM student WHERE ID= ?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			int a=preparedStatement.executeUpdate();
			if(a>0) {
				return true;
			}
			
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
		return false;
	}
	
	
	//to save a student data
	public Student saveStudent(Student student)  {
		connection = helperClass.getConnection();
		String sql="INSERT INTO student VALUES(?,?,?)";
		
		//create statement
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			  // passses the values to delimiters/placeholders
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			
			preparedStatement.execute();
			
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
		return student;
	    
		
		
		
	}
	
	

}
