package com.academy.biz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.academy.biz.student.service.SchoolVO;
import com.academy.biz.student.service.impl.SchoolDAOImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SchoolTest {
	
	@Autowired
//	private SchoolDAO dao = new SchoolDAOImpl(); 
	private SchoolDAOImpl dao; 
	
	@Before
	public void init() {
		/*
	
		SchoolVO vo3 = new SchoolVO();
		vo3.setS_name("김포고등학교");
		vo3.setS_grade(Grade.HighSchool);
		
		dao.insertSchool(vo3);
		
		SchoolVO vo4 = new SchoolVO();
		vo4.setS_name("그냥고등학교");
		vo4.setS_grade(Grade.HighSchool);
		
		dao.insertSchool(vo4);
		
		SchoolVO vo5 = new SchoolVO();
		vo5.setS_name("직업교육원");
		vo5.setS_grade(Grade.Etc);
		
		dao.insertSchool(vo5);
		*/
	}
	
	@Test
	public void getTest() {
		
		SchoolVO school = dao.getSchool(1);
		System.out.println(school.toString());
		
		List<SchoolVO> list = dao.getSchoolList();
		for (SchoolVO ss : list) {
			System.out.println(ss.toString());
		}		
	}
	
	public void udTest() {
		
		int s_seq = 3;
		
		SchoolVO school = new SchoolVO();
		school.setS_seq(s_seq);
		school.setS_name("빨간망토어린이집");
		
		SchoolVO u_school = dao.getSchool(3);
		u_school.toString();
		
		assertThat(dao.deleteSchool(s_seq), is(true));
	}
	
	@After
	public void Destroy() {
		
	}

}
