package com.JFS.oopsconcepts;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("The total memory of the heap:"+r.totalMemory());
		System.out.println("The free memory of the heap:"+r.freeMemory());
		long OccupiedMemory=r.totalMemory()-r.freeMemory();
		System.out.println("The occupied memory of the heap:"+OccupiedMemory);
		for(int i=0;i<100000;i++) {
			Date d=new Date();
		}
		System.out.println("The total memory of the heap:"+r.totalMemory());
		System.out.println("The free memory of the heap:"+r.freeMemory());
		System.out.println("The occupied memory of the heap:"+OccupiedMemory);
		r.gc();
		System.out.println("The total memory of the heap:"+r.totalMemory());
		System.out.println("The free memory of the heap:"+r.freeMemory());
		System.out.println("The occupied memory of the heap:"+OccupiedMemory);
	}

}
