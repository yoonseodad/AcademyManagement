package com.academy.biz.student.service;

import java.util.List;

import com.academy.biz.student.service.SchoolVO;

public interface SchoolService {
	public boolean insertSchool(SchoolVO vo);
	public boolean updateSchool(SchoolVO vo);
	public boolean deleteSchool(int s_seq);
	public SchoolVO getSchool(int s_seq);
	public List<SchoolVO> getSchoolList();
}
