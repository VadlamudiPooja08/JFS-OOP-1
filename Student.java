package com.JFS.oopsconcepts;

public class Student {
	String name;
	int rollNumber;
	int[] marks=new int[3];
	 
	public Student() {
		name="Unknown";
		rollNumber=0;
		marks=new int[] {0,0,0};
	}
	public Student(String name,int rollNumber,int[] marks) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=new int[3];
		for(int i=0;i<3;i++) {
			this.marks[i]=marks[i];
		}
	}
	public Student(Student obj) {
		this.name=obj.name;
		this.rollNumber=obj.rollNumber;
		this.marks=obj.marks;
	}
	public void displayInfo() {
		System.out.println("Name:"+name);
		System.out.println("RollNumber:"+rollNumber);
		System.out.println("Marks:");
		for(int i=0;i<marks.length;i++) {
			System.out.println("Subject"+(i+1)+":"+marks[i]);
		}
		
	}
	public int caluculateTotal() {
		int total=0;
		for(int marks:marks) {
			total+=marks;
		}
		return total;
	}
	public double caluculateAvarage() {
		return caluculateTotal()/3.0;
	}

}
