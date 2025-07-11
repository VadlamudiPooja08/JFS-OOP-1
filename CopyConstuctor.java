package com.JFS.oopsconcepts;

public class CopyConstuctor {
		double width;
		double height;
		double depth;
		public CopyConstuctor (double width,double height,double depth) {
			this.width=width;
			this.height=height;
			this.depth=depth;
		}
		public CopyConstuctor ()
		
		
		public void displayInfo() {
			System.out.println("The box Width is:"+width);
			System.out.println("The box Height is:"+height);
			System.out.println("The box depth is:"+depth);

		}
}
