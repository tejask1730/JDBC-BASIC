package com.school.controller;

import com.school.service.StudentService;

public class TestUpdate {
public static void main(String[] args) {
	StudentService studentService = new StudentService();
	int r= studentService.updateStudentById(2);
	System.out.println(r);
}
}
