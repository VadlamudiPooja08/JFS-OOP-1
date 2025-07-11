package com.JFS.oopsconcepts;

public class CopyConstuctorDemo {

	public static void main(String[] args) {
		CopyConstuctor c1=new CopyConstuctor(10.0,3.0,2.0);
		 double volume1=c1.height*c1.width*c1.depth;
		 System.out.println("The box1 details:");
		 c1.displayInfo();
		 System.out.println("The volume of the box is:"+volume1);
		 CopyConstuctor c2=new CopyConstuctor(c1);
		 double volume2=c2.height*c2.width*c2.depth;
		 System.out.println("The box2 details:");
		 c2.displayInfo();
		 System.out.println("The volume of the box is:"+volume2);

	}

}
