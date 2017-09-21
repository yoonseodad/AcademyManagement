package com.academy.biz.student.service;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SchoolVO {

	private int s_seq;
	private String s_name;
	private int s_grade;
	/**
	 * @return the s_seq
	 */
	public int getS_seq() {
		return s_seq;
	}
	/**
	 * @param s_seq the s_seq to set
	 */
	public void setS_seq(int s_seq) {
		this.s_seq = s_seq;
	}
	/**
	 * @return the s_name
	 */
	public String getS_name() {
		return s_name;
	}
	/**
	 * @param s_name the s_name to set
	 */
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	/**
	 * @return the s_grade
	 */
	public int getS_grade() {
		return s_grade;
	}
	/**
	 * @param s_grade the s_grade to set
	 */
	public void setS_grade(int s_grade) {
		this.s_grade = s_grade;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
