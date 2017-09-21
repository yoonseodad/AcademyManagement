package com.academy.biz.student.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.academy.biz.student.service.StudentDAO;
import com.academy.biz.student.service.StudentVO;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO {

	public boolean insertStudent(StudentVO student) {
		return false;
	}
	
	public boolean deleteStudent(int seq) {
		return false;
	}
	
	public boolean updateStudent(StudentVO student) {
		return false;
	}
	
	public StudentVO getStudent(int seq) {
		return null;
	}
	
	public List<StudentVO> getStudentList() {
		return null;
	}	
	
	
	
}
