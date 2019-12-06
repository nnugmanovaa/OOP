package one;

import java.io.Serializable;
import java.util.Objects;

public class Textbook implements Serializable {
	private String isbn;
	private String title;
	private String author;

	public Textbook(String isbn, String title, String author) {
		this.author = author;
		this.isbn = isbn;
		this.title = title;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Textbook))
			return false;

		Textbook txt = (Textbook) obj;
		return this.author.equals(txt.author) && this.isbn.equals(txt.isbn) && this.title.equals(txt.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn, author, title);
	}

	@Override
	public String toString() {
		return "Info : \nISBN " + this.isbn + "\nTitle " + this.title + " \nAuthor " + this.author;
	}

}
