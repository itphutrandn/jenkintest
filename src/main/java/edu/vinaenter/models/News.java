package edu.vinaenter.models;

public class News {
	
	private int id;
	
	private String title;

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

	public News(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public News() {
		
	}
}
