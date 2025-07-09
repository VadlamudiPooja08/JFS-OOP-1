package com.JFS.oopsconcepts;

public class MovieDemo1 {

	public static void main(String[] args) {
				Movie mv1=new Movie();
				mv1.movie="Bahubali";
				mv1.director="S.S.Rajamouli";
				mv1.rating=4.5;
				System.out.println("The movie details:");
				mv1.displayMovieDetails();
				Movie mv2=new Movie();
				mv2.movie="Pushpa";
				mv2.director="Sukumar";
				mv2.rating=4;
				System.out.println("The movie details:");
				mv2.displayMovieDetails();
				Movie mv3=new Movie();
				mv3.movie="Rrr";
				mv3.director="S.S.Rajamouli";
				mv3.rating=3.5;
				System.out.println("The movie details:");
				mv3.displayMovieDetails();
			}
	}

