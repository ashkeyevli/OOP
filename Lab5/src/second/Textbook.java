package second;

import java.io.Serializable;

class Textbook implements Serializable, Cloneable {
	private int isbn;
	private String title;
	private String author;
	
	public Textbook(String title, int isbn, String author) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}
	
	public Textbook() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return String.format("Book called %s. Author is %s. ISBN is %d", title, author, isbn);
	}
	
	@Override
	public boolean equals(Object obj) {
		Textbook str = (Textbook) obj;
		return str.getTitle().equals(title) && str.getIsbn() == isbn && str.getAuthor().equals(author);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
