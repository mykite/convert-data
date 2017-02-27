package com.kite.convert.rowcolumn;

import java.util.Date;

import com.kite.convert.rowcolumn.annotation.ConvertField;

public class Emp {
	
	private String name;
	private String job;
	@ConvertField(fieldName="test_")
	private String test;
	private Date date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", job=" + job + ", test=" + test
				+ ", date=" + date + "]";
	}
	
	
}
