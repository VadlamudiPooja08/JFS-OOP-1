package com.JFS.oopsconcepts;

public class BoxDemo {

	public static void main(String[] args) {
	 Box mybox1=new Box();
	 mybox1.width=10.0;
	 mybox1.height=5.0;
	 mybox1.depth=3.0;
	 double volume1=mybox1.height*mybox1.width*mybox1.depth;
	 System.out.println("The box details:");
	 mybox1.displayBoxDetails();
	 System.out.println("The volume of the box is:"+volume1);
	 
	}

}
