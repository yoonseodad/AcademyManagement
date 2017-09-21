package com.academy.biz.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academy.biz.student.service.SchoolService;
import com.academy.biz.student.service.SchoolVO;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {
	
	@Autowired
	private SchoolDAOImpl schoolDao;

	/* (non-Javadoc)
	 * @see com.academy.biz.student.service.SchoolService#insertSchool(com.academy.biz.student.service.SchoolVO)
	 */
	@Override
	public boolean insertSchool(SchoolVO school) {
		return schoolDao.insertSchool(school);
	}

	/* (non-Javadoc)
	 * @see com.academy.biz.student.service.SchoolService#updateSchool(com.academy.biz.student.service.SchoolVO)
	 */
	@Override
	public boolean updateSchool(SchoolVO school) {
		return schoolDao.updateSchool(school);
	}

	/* (non-Javadoc)
	 * @see com.academy.biz.student.service.SchoolService#deleteSchool(int)
	 */
	@Override
	public boolean deleteSchool(int s_seq) {
		return schoolDao.deleteSchool(s_seq);
	}

	/* (non-Javadoc)
	 * @see com.academy.biz.student.service.SchoolService#getSchool(int)
	 */
	@Override
	public SchoolVO getSchool(int s_seq) {
		return schoolDao.getSchool(s_seq);
	}

	/* (non-Javadoc)
	 * @see com.academy.biz.student.service.SchoolService#getSchoolList()
	 */
	@Override
	public List<SchoolVO> getSchoolList() {
		return schoolDao.getSchoolList();
	}

}
