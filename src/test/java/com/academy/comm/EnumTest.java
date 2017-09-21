package com.academy.comm;

enum school {
	MiddleSchool(1, "중학교"), 
	HighSchool(2, "고등학교");
	
	private int value;
	private String name;
	
	school(int value, String name) {
		this.value = value;
		this.name= name;		
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	
}
public class EnumTest {
	public static void main(String[] args) {
		System.out.println(school.HighSchool.getValue());
	}
}
