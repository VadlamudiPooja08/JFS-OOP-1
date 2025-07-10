package com.JFS.oopsconcepts;

public class Constructor {
	double width;
	double height;
	double depth;
	public Constructor(double width,double height,double depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	public void displayBoxDetails() {
		System.out.println("The box Width is:"+width);
		System.out.println("The box Height is:"+height);
		System.out.println("The box depth is:"+depth);

	}
}
