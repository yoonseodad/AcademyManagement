package com.academy.biz;

import org.junit.Test;

import com.academy.biz.student.service.StudentVO;

public class StudentTest {

	@Test
	public void toStringTest() {
		StudentVO student = new StudentVO();
		System.out.println(student.toString());
	}
}
