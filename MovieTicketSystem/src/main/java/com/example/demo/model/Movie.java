package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
@Id
private int Movie_code; 
private String name;
private String language;
private int ratings; 
private String description;

public int getMovie_code() {
	return Movie_code;
}
public void setMovie_code(int movie_code) {
	Movie_code = movie_code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public int getRatings() {
	return ratings;
}
public void setRatings(int ratings) {
	this.ratings = ratings;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Movie [Movie_code=" + Movie_code + ", name=" + name + ", language=" + language + ", ratings=" + ratings
			+ ", description=" + description + "]";
}	

}
