package com.elnur.blog.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
@Entity
public class Post {
	
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String anons, title, full_text;
private int views;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getAnons() {
	return anons;
}
public void setAnons(String anons) {
	this.anons = anons;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getFull_text() {
	return full_text;
}
public void setFull_text(String full_text) {
	this.full_text = full_text;
}
public int getViews() {
	return views;
}
public void setViews(int views) {
	this.views = views;
}




public Post() {
	//super();
	// TODO Auto-generated constructor stub
}
public Post(String anons, String title, String full_text) {
	//super();
	this.anons = anons;
	this.title = title;
	this.full_text = full_text;
}





}
