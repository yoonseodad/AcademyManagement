package com.academy.biz.student.service;

import java.util.List;

public interface SchoolDAO {

	public boolean insertSchool(SchoolVO school);
	public boolean deleteSchool(int s_seq);
	public boolean updateSchool(SchoolVO school);
	public SchoolVO getSchool(int s_seq);
	public List<SchoolVO> getSchoolList();
}
