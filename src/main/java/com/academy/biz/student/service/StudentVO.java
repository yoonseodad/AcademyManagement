package com.academy.biz.student.service;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class StudentVO {
	private int seq;
	private String name;
	private int age;
	private String birth;
	private String hp;
	private String addr;
	private Grade grade;
	private Date regdate;
	private Date del_date;
	private Date re_date;
	/**
	 * @return the seq
	 */
	public int getSeq() {
		return seq;
	}
	/**
	 * @param seq the seq to set
	 */
	public void setSeq(int seq) {
		this.seq = seq;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the birth
	 */
	public String getBirth() {
		return birth;
	}
	/**
	 * @param birth the birth to set
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}
	/**
	 * @return the hp
	 */
	public String getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(String hp) {
		this.hp = hp;
	}
	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}
	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}
	/**
	 * @return the grade
	 */
	public Grade getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	/**
	 * @return the regdate
	 */
	public Date getRegdate() {
		return regdate;
	}
	/**
	 * @param regdate the regdate to set
	 */
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	/**
	 * @return the del_date
	 */
	public Date getDel_date() {
		return del_date;
	}
	/**
	 * @param del_date the del_date to set
	 */
	public void setDel_date(Date del_date) {
		this.del_date = del_date;
	}
	/**
	 * @return the re_date
	 */
	public Date getRe_date() {
		return re_date;
	}
	/**
	 * @param re_date the re_date to set
	 */
	public void setRe_date(Date re_date) {
		this.re_date = re_date;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		ToStringBuilder.setDefaultStyle(ToStringStyle.SHORT_PREFIX_STYLE);
		return ToStringBuilder.reflectionToString(this);
	}
}
