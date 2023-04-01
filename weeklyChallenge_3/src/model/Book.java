package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import enum_project.Genre_Enum;

@Entity
@DiscriminatorValue(value = "book")
public class Book extends Archive {

	String author;
	@Enumerated(EnumType.STRING)
	private Genre_Enum genre;

	public Book() {
		super();
	}

	public Book(String author, Genre_Enum genre, String titolo, int yearOfPublishing, int numberOfPages) {
		super(titolo, yearOfPublishing, numberOfPages);
		this.author = author;
		this.genre = genre;
	}

	public String toString() {
		return "\n" + "\nTitle: " + this.getTitle() + "\nAuthor: " + this.author + "\nGenre: " + this.genre
				+ "\nNumber of pages: " + this.getNumberOfPages() + "\nYear of publishing: "
				+ this.getYearOfPublishing() + "\nISBN Code: " + this.getISBNcode();

	}

}