package com.academy.biz.student.service;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SchoolVO {

	private int s_seq;
	private String s_name;
	private Enum<Grade> grade;
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
	 * @return the grade
	 */
	public Enum<Grade> getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(Enum<Grade> grade) {
		this.grade = grade;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
