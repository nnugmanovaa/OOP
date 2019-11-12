package lab4task2;

import java.io.Serializable;

public class Textbook implements Serializable {

	private int isbn;
	private String title;
	private String author;

	public Textbook(int isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Textbook)) {
			return false;
		}
		Textbook textbook = (Textbook) o;

		return textbook.isbn == isbn && textbook.author.equals(author) && textbook.title.equals(title);
	}

	public int hashCode() {
		int res = 7;
		res = 89 * res + isbn;
		res = 89 * res + author.hashCode();
		res = 89 * res + title.hashCode();
		return res;
	}

	public String toString() {
		return "Author: " + author + "\n" + "Title: " + title + "\n" + "isbn: " + isbn;
	}

}
