package com.collegemanagement.model;

public class Faculty {
private int fid;
private String fname;
private Course course;

public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course fname2) {
	this.course = fname2;
}
 
public String toString() {
	return "Faculty [fid=" + fid + ", fname=" + fname + ", course=" + course + "]";
}
public Faculty(int fid2, String fname2, String course2) {	super();
//	// TODO Auto-generated constructor stub
}
public Faculty() {
	// TODO Auto-generated constructor stub
}

}
