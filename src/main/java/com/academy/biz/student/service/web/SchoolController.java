package com.academy.biz.student.service.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.academy.biz.student.service.SchoolService;
import com.academy.biz.student.service.SchoolVO;

@Controller
@RequestMapping("/school")
public class SchoolController {

	@Autowired
	SchoolService schoolService;

	@RequestMapping("list.ricemen")
	public String listSchool(Model model) {
		List<SchoolVO> schoolList = schoolService.getSchoolList();
		model.addAttribute("schoolList", schoolList);
		return "school/getSchoolList.jsp";
	}
	
	@RequestMapping("view.ricemen")
	public String view(@RequestParam("s_seq") int s_seq, Model model) {
		SchoolVO school = schoolService.getSchool(s_seq);
		model.addAttribute("school", school);
		return "school/getSchool.jsp";
	}
}
