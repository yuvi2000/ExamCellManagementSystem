package com.iet.ExamCell.Model;

import java.io.Serializable;

public class Seating implements Serializable {
	
	private int seatingId;
	private int hallno;
	private int year;
	private int degree;
	private int dept;
	private int regno;
	private int seats;
	 
public Seating(int hallno, int year, int degree, int dept, int regno, int seats)
{
	this.hallno=hallno;
	this.year=year;
	this.degree=degree;
	this.dept=dept;
	this.regno=regno;
	this.seats=seats;
	
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
public int getHallno() {
	return hallno;
}
public void setHallno(int hallno) {
	this.hallno = hallno;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
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
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
	
	

}
