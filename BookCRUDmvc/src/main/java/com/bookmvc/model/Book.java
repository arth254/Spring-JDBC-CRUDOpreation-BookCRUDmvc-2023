package com.bookmvc.model;

public class Book {
	private int id;
	private String title;
	private String author;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getprice() {
		return price;
	}
	public void setprice(float price) {
		this.price = price;
	}
	public Book(int id, String title, String author, float price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Book(String title, String author, float price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Book(int id) {
		super();
		this.id = id;
	}
	public Book() {
		super();
	}
	
}
