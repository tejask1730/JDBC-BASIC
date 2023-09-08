package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class TestGetAll {
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		Student student=null;
		Student s= studentService.getStudent(student);
		if(s!=null) {
			System.out.println(s);
		}
	}

}
