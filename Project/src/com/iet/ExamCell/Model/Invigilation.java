package com.iet.ExamCell.Model;

import java.io.Serializable;
import java.sql.Date;


public class Invigilation implements Serializable {
	
private int invigilationId;
private int hallnoId;
private Date date;
private String session;

public Invigilation()
{
}

public Invigilation(int invigilationId, int hallnoId, Date date, String session) {
	
	this.invigilationId = invigilationId;
	this.hallnoId = hallnoId;
	this.date = date;
	this.session = session;
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

}

