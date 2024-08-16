package com.sit.Collegemanagement.servicelmpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.collegemanagement.model.Batch;
import com.collegemanagement.model.Course;
import com.collegemanagement.model.Faculty;
import com.collegemanagement.model.Student;
import com.sit.Collegemanagement.service.Sit;

public class Karvenagar implements Sit {
	
List<Course>clist=new ArrayList<Course>();
List<Faculty>flist=new ArrayList<Faculty>();
List<Batch>blist=new ArrayList<Batch>();
List<Student>slist=new ArrayList<Student>();


Scanner scanner=new Scanner(System.in);

@Override
public void addCourse() {
	Course course=new Course();
	
	System.out.println("enter course id");
	int Cid=scanner.nextInt();
	course.setCid(Cid);
	
	scanner.nextLine();
	
	System.out.println("enter course name");
	String Cname=scanner.nextLine();
	course.setCname(Cname);
	clist.add(course);
	System.out.println("cousre details added successfully...");
}
@Override
public void viewCourse() {
	Iterator<Course>iterator=clist.iterator();
	while(iterator.hasNext()) {
		Course course=iterator.next();
		System.out.println("courseid:"+course.getCid());
		System.out.println("coursename:"+course.getCname());
	}
}
@Override
public void addFaculty() {
	Faculty faculty=new Faculty();
	
	System.out.println("enter faculty fid");
	int fid=scanner.nextInt();
	faculty.setFid(fid);
	
	System.out.println("enter faculty fname");
	String fname=scanner.next();
	faculty.setFname(fname);
	
	System.out.println("enter your course ID");
	int cid=scanner.nextInt();
	//faculty.setCourse(null);
//	flist.add();
	for( Course c:clist) {
		if(c.getCid()==cid) {
			faculty.setCourse(c);
		   flist.add(faculty);
		}
	}
       
	System.out.println("Faculty Added successfully");
}

@Override
public void viewFaculty() {
	Iterator<Faculty>iterator=flist.iterator();
	while(iterator.hasNext()) {
		Faculty faculty=iterator.next();
                
System.out.println("faculty id "+faculty.getFid());
System.out.println("faculty name "+faculty.getFname());
	//System.out.println("course id"+faculty.getCourse().getCid());	
	//System.out.println("course name"+faculty.getCourse().getCname());
System.out.println("course Allocated  "+faculty.getCourse().getCid()+" "+faculty.getCourse().getCname());
		
	}
	
}
@Override
public void addBatch() {
	Batch batch=new Batch();
	
	System.out.println("enter batch bid");
	int bid=scanner.nextInt();
	batch.setBid(bid);
	
	System.out.println("enter batch bname");
	String bname=scanner.next();
	batch.setBname(bname);
	blist.add(batch);
	
	System.out.println("addd faculty to batch ");
	System.out.println(" Enter FAculty id to Assign ");
	
	int Faculty=scanner.nextInt();
	for ( Faculty  ff :  flist) { 
		
	
		if(ff.getFid()==Faculty) {
		Batch.setFaculty(ff);
		}
	}
	blist.add(batch);
	System.out.println("batch added successfully");

}
@Override
public void viewBatch() {
	Iterator<Batch>iterator=blist.iterator();
	while(iterator.hasNext()) {
		Batch batch=iterator.next();
		
		System.out.println("batch id"+batch.getBid());
		System.out.println("batch name"+batch.getBname());
		System.out.println("batch allocated"+batch.getFaculty().getFid()+"  "+batch.getFaculty().getFname());
	}
	
}
@Override
public void addStudent() {
	Student student=new Student();
	
	System.out.println("enter student id");
	int sid=scanner.nextInt();
	student.setSid(sid);
	
	System.out.println("enter student name");
	String sname=scanner.next();
	student.setSname(sname);
	System.out.println("add batch for student");
	System.out.println("enter batch id to assign");
	int batch=scanner.nextInt();
	for(Batch b:blist) {
		if(b.getBid()==batch) {
			student.setBatch(b);
		}
		slist.add(student);
		System.out.println("student added successfully");
	}	
}
@Override
public void viewStudent() {
	if (slist.isEmpty()) {
        System.out.println("No students available.");
        return;
    }

    Iterator<Student> iterator = slist.iterator();
    while (iterator.hasNext()) {
        Student student = iterator.next();
        System.out.println("Student ID: " + student.getSid());
        System.out.println("Student Name: " + student.getSname());
       // System.out.println("student allocated"+student.getBatch().getBid()+""+student.getBatch().getBname());
        System.out.println();
    }

	
}
}
