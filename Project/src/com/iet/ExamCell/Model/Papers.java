package com.iet.ExamCell.Model;

import java.io.Serializable;

public class Papers implements Serializable {
	
private int paperId;
private int degreeId;
private String degreeName;
private int deptId;
private String deptName;
private int yearId;
private int yearName;
private int semesterId;
private String semesterName;
private int paper;
private String paperName;

public Papers(int paperId, int degreeId, String degreeName, int deptId,
		String deptName, int yearId, int yearName, int semesterId,
		String semesterName, int paper, String paperName) {
	
	this.paperId = paperId;
	this.degreeId = degreeId;
	this.degreeName = degreeName;
	this.deptId = deptId;
	this.deptName = deptName;
	this.yearId = yearId;
	this.yearName = yearName;
	this.semesterId = semesterId;
	this.semesterName = semesterName;
	this.paper = paper;
	this.paperName = paperName;
}

public Papers()
{
	
}

public int getPaperId() {
	return paperId;
}

public void setPaperId(int paperId) {
	this.paperId = paperId;
}

public int getDegreeId() {
	return degreeId;
}

public void setDegreeId(int degreeId) {
	this.degreeId = degreeId;
}

public String getDegreeName() {
	return degreeName;
}

public void setDegreeName(String degreeName) {
	this.degreeName = degreeName;
}

public int getDeptId() {
	return deptId;
}

public void setDeptId(int deptId) {
	this.deptId = deptId;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public int getYearId() {
	return yearId;
}

public void setYearId(int yearId) {
	this.yearId = yearId;
}

public int getYearName() {
	return yearName;
}

public void setYearName(int yearName) {
	this.yearName = yearName;
}

public int getSemesterId() {
	return semesterId;
}

public void setSemesterId(int semesterId) {
	this.semesterId = semesterId;
}

public String getSemesterName() {
	return semesterName;
}

public void setSemesterName(String semesterName) {
	this.semesterName = semesterName;
}

public int getPaper() {
	return paper;
}

public void setPaper(int paper) {
	this.paper = paper;
}

public String getPaperName() {
	return paperName;
}

public void setPaperName(String paperName) {
	this.paperName = paperName;
}


}