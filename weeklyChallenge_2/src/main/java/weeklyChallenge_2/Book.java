package weeklyChallenge_2;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class Book extends Archive{
	String author;
	Enum<Genre_Enum> genre;
	
	public Book(String author,Enum<Genre_Enum> genre, Long ISBNcode, String titolo, Long yearOfPublishing, int numberOfPages) {
		super(ISBNcode, titolo, yearOfPublishing, numberOfPages);		
this.author=author;
this.genre=genre;



	}
	
	
	  public String toString() { return "\n"+ "\nTitle: " + this.titolo+"Author: "+
	  this.author + "\nGenre: "+ this.genre + "\nNumber of pages: "+
	  this.numberOfPages +"\nYear of publishing: "+
	  this.yearOfPublishing+"\nISBN Code: "+ this.ISBNcode ;
	  
	  }
	 
	
}
