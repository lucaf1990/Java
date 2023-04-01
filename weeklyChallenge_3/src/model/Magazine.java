package model;

import javax.persistence.*;

import enum_project.Magazine_enum_frequency;

@Entity
@DiscriminatorValue(value = "magazine")
public class Magazine extends Archive {

	@Enumerated(EnumType.STRING)
	private Magazine_enum_frequency frequencyOfPublishing;

	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Magazine(Magazine_enum_frequency frequencyOfPublishing, String titolo, int yearOfPublishing,
			int numberOfPages) {
		super(titolo, yearOfPublishing, numberOfPages);
		this.frequencyOfPublishing = frequencyOfPublishing;
	}

	public String toString() {
		return "\n" + "\nTitle: " + this.getTitle() + "\nFrequency of publishing: " + this.frequencyOfPublishing
				+ "\nNumber of pages: " + this.getNumberOfPages() + "\nYear of publishing: "
				+ this.getYearOfPublishing() + "\nISBN Code: " + this.getISBNcode();

	}

}
