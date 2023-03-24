package weeklyChallenge_2;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
@AllArgsConstructor
@ToString
@Getter
public class Archive {
	
	
	Long ISBNcode;
	String titolo;
	Long yearOfPublishing;
	int numberOfPages;
	
	
	public Archive(long ISBNCode, String title, Long year, int  numOfPages ) {	
		this.ISBNcode=ISBNCode;
		this.titolo=title;
		this.yearOfPublishing=year;
		this.numberOfPages=numOfPages;
		
	}


}
