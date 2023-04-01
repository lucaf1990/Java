package model;

import java.io.Serializable;

import javax.persistence.*;


@Entity 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "catalogo")


public abstract class Archive  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ISBNcode;
	private String titolo;
	private int yearOfPublishing;
	private int numberOfPages;

	public Archive() {
		super();
	}

	public Archive(String titolo, int year, int numOfPages) {

		this.titolo = titolo;
		this.yearOfPublishing = year;
		this.numberOfPages = numOfPages;

	}

	public Archive(Long iSBNcode, String titolo, int yearOfPublishing, int numberOfPages) {
		super();
		ISBNcode = iSBNcode;
		this.titolo = titolo;
		this.yearOfPublishing = yearOfPublishing;
		this.numberOfPages = numberOfPages;
	}

	public Long getISBNcode() {
		return ISBNcode;
	}

	@Override
	public String toString() {
		return "Archive [ISBNcode=" + ISBNcode + ", title=" + titolo + ", yearOfPublishing=" + yearOfPublishing
				+ ", numberOfPages=" + numberOfPages + "]";
	}

	public void setISBNcode(Long iSBNcode) {
		ISBNcode = iSBNcode;
	}

	public String getTitle() {
		return titolo;
	}

	public void setTitle(String title) {
		this.titolo = title;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

}
