package com.academy.biz.dto;

public enum Grade {
	
	MiddleSchool("중학생"), HighSchool("고등학생"), RepeatStudent("재수생");
	
	final private String name;
	
	private Grade(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
}
