package com.academy.biz.student.service;

import java.util.List;

public interface StudentDAO {

	boolean insertStudent(StudentVO student);

	boolean deleteStudent(int seq);

	boolean updateStudent(StudentVO student);

	StudentVO getStudent(int seq);

	List<StudentVO> getStudentList();

}