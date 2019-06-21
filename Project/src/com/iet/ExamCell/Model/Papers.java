package com.iet.ExamCell.Model;

import java.io.Serializable;

public class Papers implements Serializable {
	

private int paperId;
private int degree;
private int dept;
private int year;
private int semester;
private int paper;
private String paperName;
private String degreeName;
private String deptName;
private int yearName;
private String semesterName;

public Papers(int degree, int dept, int year, int semester, int paper, String paperName, String degreeName, String deptName, int yearName, String semesterName ){
	
this.degree = degree;
this.dept = dept;
this.year = year;
this.semester = semester;
this.paperName = paperName;
this.degreeName = degreeName;
this.deptName = deptName;
this.yearName = yearName;
this.semesterName = semesterName;
}

public Papers(){
	
}


public int getPaper() {
	return paper;
}


public void setPaper(int paper) {
	this.paper = paper;
}


public int getPaperId(){
	return paperId;
}

public void setPaperId(int paperId) {
	this.paperId = paperId;
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
public String getPaperName() {
	return paperName;
}
public void setPaperName(String paperName) {
	this.paperName = paperName;
}
public String getDegreeName() {
	return degreeName;
}
public void setDegreeName(String degreeName) {
	this.degreeName = degreeName;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public int getYearName() {
	return yearName;
}
public void setYearName(int yearName) {
	 this.yearName = yearName;
}
public String getSemesterName() {
	return semesterName;
}
public void setSemesterName(String semesterName) {
	this.semesterName = semesterName;
}
}