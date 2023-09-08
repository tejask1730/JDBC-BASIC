package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {
	StudentDao studentDao= new StudentDao();
	public Student getStudent(Student student) {
		Student s = studentDao.getStudent(student);
		return s;
	}
	
	public int updateStudentById(int id) {
	return studentDao.updateStudentById(id);
	
	}
	
	public boolean deleteStudentById(int id) {
	return studentDao.deleteStudentById(id);
	
	}
	

	public Student saveStudent(Student student) {
		Student s = studentDao.saveStudent(student);
		return s;
		
	}
}
