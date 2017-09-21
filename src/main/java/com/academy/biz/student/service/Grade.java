package com.academy.biz.student.service;

public enum Grade {
	
	ElementarySchool(1, "초등학교"), 
	MiddleSchool(2, "중학생"), 
	HighSchool(3, "고등학생"), 
	RepeatStudent(4, "재수생"), 
	University(5, "대학생"), 
	Etc(6, "기타");
	
	private int value;
	private final String name;
	
	Grade(int value, String name) {
		this.value = value;
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public static Grade valueOf(int value) {
		switch(value) {
		case 1: return ElementarySchool;
		case 2: return MiddleSchool;
		case 3: return HighSchool;
		case 4: return RepeatStudent;
		case 5: return University;
		case 6: return Etc;
		default: throw new AssertionError("Unknow value : "  + value);
		}
	}
	
	public static Grade NameOf(int value) {
		switch(value) {
		case 1: return ElementarySchool;
		case 2: return MiddleSchool;
		case 3: return HighSchool;
		case 4: return RepeatStudent;
		case 5: return University;
		case 6: return Etc;
		default: throw new AssertionError("Unknow value : "  + value);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Grade.valueOf(Grade.MiddleSchool));
	}
	
}
