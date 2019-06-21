package com.iet.ExamCell.Model;

import java.io.Serializable;
import java.sql.Date;


public class Invigilation implements Serializable {
	
	public int getInvigilationId() {
		return invigilationId;
	}
	public void setInvigilationId(int invigilationId) {
		this.invigilationId = invigilationId;
	}
	
private int invigilationId;
private int hallno;
private Date date;
private String session;
public int getHallno() {
	return hallno;
}
public void setHallno(int hallno) {
	this.hallno = hallno;
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

}


