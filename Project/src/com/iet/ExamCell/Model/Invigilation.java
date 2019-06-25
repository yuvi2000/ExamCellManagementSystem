package com.iet.ExamCell.Model;

import java.io.Serializable;
import java.sql.Date;


public class Invigilation implements Serializable {
	
private int invigilationId;
private int hallnoId;
private Date date;
private String session;
private int facultyId;
private int deptId;

public Invigilation()
{
}

public Invigilation(int invigilationId, int hallnoId, Date date,
		String session, int facultyId, int deptId) {
	super();
	this.invigilationId = invigilationId;
	this.hallnoId = hallnoId;
	this.date = date;
	this.session = session;
	this.facultyId = facultyId;
	this.deptId = deptId;
}

public int getInvigilationId() {
	return invigilationId;
}

public void setInvigilationId(int invigilationId) {
	this.invigilationId = invigilationId;
}

public int getHallnoId() {
	return hallnoId;
}

public void setHallnoId(int hallnoId) {
	this.hallnoId = hallnoId;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public String getSession() {
	return session;
}

public void setSession(String session) {
	this.session = session;
}

public int getFacultyId() {
	return facultyId;
}

public void setFacultyId(int facultyId) {
	this.facultyId = facultyId;
}

public int getDeptId() {
	return deptId;
}

public void setDeptId(int deptId) {
	this.deptId = deptId;
}


}

