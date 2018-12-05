package com.cs252.soggyapples;

import com.google.cloud.Date;

public class Movie {
	String title;
	String posterPath;
	String description;
	String date;
	String id;
	
	public Movie() {
		
	}
	
	public Movie(String title, String poster, String desc, String date, int id) {
		this.title = title;
		this.posterPath = poster;
		this.description = desc;
		this.date = date;
		this.id = (new Integer(id)).toString();		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	
}
