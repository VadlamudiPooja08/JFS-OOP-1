package com.JFS.oopsconcepts;

public class ConstructorDemo {

	public static void main(String[] args) {
		Constructor c1=new Constructor(10.0,3.0,2.0);
		 double volume1=c1.height*c1.width*c1.depth;
		 System.out.println("The box1 details:");
		 c1.displayBoxDetails();
		 System.out.println("The volume of the box is:"+volume1);
		 Constructor c2=new Constructor(20.0,7.0,5.0);
		 double volume2=c2.height*c2.width*c2.depth;
		 System.out.println("The box2 details:");
		 c2.displayBoxDetails();
		 System.out.println("The volume of the box is:"+volume2);
		}
}
