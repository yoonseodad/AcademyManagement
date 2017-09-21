package com.academy.biz.student.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.biz.student.service.SchoolDAO;
import com.academy.biz.student.service.SchoolVO;

@Repository("schoolDao")
public class SchoolDAOImpl implements SchoolDAO {
	
	@Autowired
	SqlSessionTemplate template;

	/* (non-Javadoc)
	 * @see com.academy.biz.student.service.SchoolDAO#insertSchool(com.academy.biz.student.service.SchoolVO)
	 */
	@Override
	public boolean insertSchool(SchoolVO school) {
		int iCount = template.insert("academy.school.insertSchool", school);
		return (iCount == 1 ? true : false);
	}

	/* (non-Javadoc)
	 * @see com.academy.biz.student.service.SchoolDAO#deleteSchool(int)
	 */
	@Override
	public boolean deleteSchool(int s_seq) {
		int iCount = template.insert("academy.school.deleteSchool", s_seq);
		return (iCount == 1 ? true : false);
	}

	/* (non-Javadoc)
	 * @see com.academy.biz.student.service.SchoolDAO#updateSchool(com.academy.biz.student.service.SchoolVO)
	 */
	@Override
	public boolean updateSchool(SchoolVO school) {
		int iCount = template.insert("academy.school.updateSchool", school);
		return (iCount == 1 ? true : false);
	}

	/* (non-Javadoc)
	 * @see com.academy.biz.student.service.SchoolDAO#getSchool(int)
	 */
	@Override
	public SchoolVO getSchool(int s_seq) {
		return template.selectOne("academy.school.getSchool", s_seq);
	}

	/* (non-Javadoc)
	 * @see com.academy.biz.student.service.SchoolDAO#getSchoolList()
	 */
	@Override
	public List<SchoolVO> getSchoolList() {
		return template.selectList("academy.school.getSchoolList");
	}	

}
