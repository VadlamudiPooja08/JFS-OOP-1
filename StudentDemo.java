package com.JFS.oopsconcepts;

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student();
		int marks[]={10,20,50};
		Student s1=new Student("pooja",1,marks);
		System.out.println("Student Details:");
		s.displayInfo();
		System.out.println("Total Marks:"+s.caluculateTotal());
		System.out.println("Average Marks:"+s.caluculateAvarage());
		System.out.println("Student Details:");
		s1.displayInfo();
		System.out.println("Total Marks:"+s1.caluculateTotal());
		System.out.println("Average Marks:"+s1.caluculateAvarage());
		Student s2=new Student(s1);
		s2.displayInfo();
		System.out.println("Total Marks:"+s2.caluculateTotal());
		System.out.println("Average Marks:"+s2.caluculateAvarage());
		
		
	}

}
