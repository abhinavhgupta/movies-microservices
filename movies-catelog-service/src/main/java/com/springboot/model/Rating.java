package com.springboot.model;

public class Rating {
	private String movieId;
	private int rating;

	public Rating() {
	}
	
	public Rating(String movieId, int rating) {
		this.setMovieId(movieId);
		this.setRating(rating);
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
