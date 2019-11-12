package Task2;

import java.io.*;
import java.io.Serializable;
import java.util.Vector;

public class Textbook implements Serializable {
	private static final long serialVersionUID = 6529685098267757690L;
	private String title;
	private String author;
	private int isbn;

	public Textbook(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getISBN() {
		return isbn;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Textbook))
			return false;
		Textbook txb = (Textbook) obj;
		return this.title.equals(txb.title) && this.author.equals(txb.author) && this.isbn==txb.isbn;
	}

	public String toString() {
		return "Textbook: isbn:" + this.isbn + " Title:" + this.title + " Authors:" + this.author;
	}

}
