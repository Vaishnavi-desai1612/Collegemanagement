package com.collegemanagement.model;

public class Course {
private int cid;
private String cname;

private Course course;

public int getCid() {
	return cid;
}



public String getCname() {
	return cname;
}



public void setCname(String cname) {
	this.cname = cname;
}



public Course getCourse() {
	return course;
}



public void setCourse(Course course) {
	this.course = course;
}



public void setCid(int cid) {
	this.cid = cid;
}

@Override
public String toString() {
	return "Course [cid=" + cid + ", cname=" + cname + "]";
}
public Course(int cid2, String cname2) {
	super();
	// TODO Auto-generated constructor stub
}

public Course() {
	// TODO Auto-generated constructor stub
}
}
