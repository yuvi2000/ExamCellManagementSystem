package com.iet.ExamCell.Model;

import java.io.Serializable;

public class Seating implements Serializable {
	
	private int seatingId;
	private int hallnoId;
	private int yearId;
	private int degreeId;
	private int sectionId ;
	private int nominalRoleId;
	private int noofstudents;
	 

public Seating(int seatingId, int hallnoId, int yearId, int degreeId,
			int sectionId, int nominalRoleId, int noofstudents) {
	
		this.seatingId = seatingId;
		this.hallnoId = hallnoId;
		this.yearId = yearId;
		this.degreeId = degreeId;
		this.sectionId = sectionId;
		this.nominalRoleId = nominalRoleId;
		this.noofstudents = noofstudents;
	}

public Seating() {
	// TODO Auto-generated constructor stub
}

public int getSeatingId() {
	return seatingId;
}

public void setSeatingId(int seatingId) {
	this.seatingId = seatingId;
}

public int getHallnoId() {
	return hallnoId;
}

public void setHallnoId(int hallnoId) {
	this.hallnoId = hallnoId;
}

public int getYearId() {
	return yearId;
}

public void setYearId(int yearId) {
	this.yearId = yearId;
}

public int getDegreeId() {
	return degreeId;
}

public void setDegreeId(int degreeId) {
	this.degreeId = degreeId;
}

public int getSectionId() {
	return sectionId;
}

public void setSectionId(int sectionId) {
	this.sectionId = sectionId;
}


public int getNominalRoleId() {
	return nominalRoleId;
}

public void setNominalRoleId(int nominalRoleId) {
	this.nominalRoleId = nominalRoleId;
}

public int getNoofstudents() {
	return noofstudents;
}

public void setNoofstudents(int noofstudents) {
	this.noofstudents = noofstudents;
}
}
