package com.iet.ExamCell.Model;

import java.io.Serializable;

public class Papers implements Serializable {
	
	public int getPaperId() {
		return paperId;
	}

	public void setPaperId(int papersId) {
		this.paperId = papersId;
	}
	
private int paperId;
private int degree;
private int dept;
private int year;
private int semester;
private int paper;

public Papers(int degree, int dept, int year, int semester, int paper ){
	
this.degree = degree;
this.dept = dept;
this.year = year;
this.semester = semester;
this.paper = paper;

}
public Papers() {
	// TODO Auto-generated constructor stub
}
public int getDegree() {
	return degree;
}
public void setDegree(int degree) {
	this.degree = degree;
}
public int getDept() {
	return dept;
}
public void setDept(int dept) {
	this.dept = dept;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getSemester() {
	return semester;
}
public void setSemester(int semester) {
	this.semester = semester;
}
public int getPaper() {
	return paper;
}
public void setPaper(int paper) {
	this.paper = paper;
}
}