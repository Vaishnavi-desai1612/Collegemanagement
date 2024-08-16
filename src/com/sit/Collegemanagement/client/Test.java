package com.sit.Collegemanagement.client;

import java.util.Scanner;

import com.sit.Collegemanagement.servicelmpl.Karvenagar;

public class Test {
public static void main(String[] args) {
	Karvenagar k=new Karvenagar();
	Scanner scanner=new Scanner(System.in);
	boolean running =true;


	while(running) {
		displaymenu();
		
		int choice=scanner.nextInt();
		scanner.nextLine();
		
		switch (choice) {
		
		case 1:
			
			k.addCourse();
			break;
			
		case 2:
			
			k.viewCourse();
			break;
			
		case 3:
			
			k.addFaculty();
			break;
			
		case 4:
			
			k.viewFaculty();
			break;
			
		case 5:
			
			k.addBatch();
			break;
			
		case 6:
			
			k.viewBatch();
			break;
			
		case 7:
			
			k.addStudent();
			break;
			
		case 8:
			
			
			k.viewStudent();
			break;
			
		case 0:
			
			running= false;
		break;
		
		default:
			System.out.println("invalid choice.please try again.....");
	}
}
	scanner.close();

	
}

private static void displaymenu() {
	System.out.println("College management system");
	System.out.println("1.addcourse");
	System.out.println("2.viewcourse");
	System.out.println("3.addfaculty");
	System.out.println("4.viewfaculty");
	System.out.println("5.addbatch");
	System.out.println("6.viewbatch");
	System.out.println("7.addstudent");
	System.out.println("8.viewstudent");
	System.out.println("0.exit");
}
}



