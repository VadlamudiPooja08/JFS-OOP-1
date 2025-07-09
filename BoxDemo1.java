package com.JFS.oopsconcepts;

public class BoxDemo1 {
	public static void main(String[] args) {
		 Box1 mybox1=new Box1();
		 mybox1.width=10.0;
		 mybox1.height=5.0;
		 mybox1.depth=3.0;
		 double volume1=mybox1.height*mybox1.width*mybox1.depth;
		 System.out.println("The box details:");
		 mybox1.displayBoxDetails();
		 System.out.println("The volume of the box is:"+volume1);
		 
		}

}
