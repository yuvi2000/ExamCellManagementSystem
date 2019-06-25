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
	private String nominalRolefrom;
	private String nominalRoleupto;
	private int noofstudents;
	
	public Seating() 
	{
		
	}

	public Seating(int seatingId, int hallnoId, String hallName, int yearId,
			int yearName, int degreeId, String degreeName, int sectionId,
			String sectionName, String className, int nominalRoleId,
			String nominalRolefrom, String nominalRoleupto, int noofstudents) {
		super();
		this.seatingId = seatingId;
		this.hallnoId = hallnoId;
		this.hallName = hallName;
		this.yearId = yearId;
		this.yearName = yearName;
		this.degreeId = degreeId;
		this.degreeName = degreeName;
		this.sectionId = sectionId;
		this.sectionName = sectionName;
		this.className = className;
		this.nominalRoleId = nominalRoleId;
		this.nominalRolefrom = nominalRolefrom;
		this.nominalRoleupto = nominalRoleupto;
		this.noofstudents = noofstudents;
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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getNominalRoleId() {
		return nominalRoleId;
	}

	public void setNominalRoleId(int nominalRoleId) {
		this.nominalRoleId = nominalRoleId;
	}

	public String getNominalRolefrom() {
		return nominalRolefrom;
	}

	public void setNominalRolefrom(String nominalRolefrom) {
		this.nominalRolefrom = nominalRolefrom;
	}

	public String getNominalRoleupto() {
		return nominalRoleupto;
	}

	public void setNominalRoleupto(String nominalRoleupto) {
		this.nominalRoleupto = nominalRoleupto;
	}

	public int getNoofstudents() {
		return noofstudents;
	}

	public void setNoofstudents(int noofstudents) {
		this.noofstudents = noofstudents;
	}

	
	
}