package com.iet.ExamCell.Model;

import java.io.Serializable;

public class Seating implements Serializable {
	
	private int seatingId;
	private int hallnoId;
	private String hallName;
	private int yearId;
	private int  yearName;
	private int degreeId;
	private String degreeName;
	private int sectionId ;
	private String sectionName;
	private String className;
	private int nominalRoleId;
	private String nominalRoleName;
	private int noofstudents;
	public Seating(int seatingId, int hallnoId, String hallName, int yearId,
			int yearName, int degreeId, String degreeName, int sectionId,
			String sectionName, String className, int nominalRoleId, String nominalRoleName,
			int noofstudents) {
		
		this.seatingId = seatingId;
		this.hallnoId = hallnoId;
		this.hallName = hallName;
		this.yearId = yearId;
		this.yearName = yearName;
		this.degreeId = degreeId;
		this.degreeName = degreeName;
		this.sectionId = sectionId;
		this.sectionName = sectionName;
		this.className= className;
		this.nominalRoleId = nominalRoleId;
		this.nominalRoleName = nominalRoleName;
		this.noofstudents = noofstudents;
	}
	public Seating() 
	{
		
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
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
	public String getHallName() {
		return hallName;
	}
	public void setHallName(String hallName) {
		this.hallName = hallName;
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
	public int getSectionId() {
		return sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public int getNominalRoleId() {
		return nominalRoleId;
	}
	public void setNominalRoleId(int nominalRoleId) {
		this.nominalRoleId = nominalRoleId;
	}
	public String getNominalRoleName() {
		return nominalRoleName;
	}
	public void setNominalRoleName(String nominalRoleName) {
		this.nominalRoleName = nominalRoleName;
	}
	public int getNoofstudents() {
		return noofstudents;
	}
	public void setNoofstudents(int noofstudents) {
		this.noofstudents = noofstudents;
	
	}
}