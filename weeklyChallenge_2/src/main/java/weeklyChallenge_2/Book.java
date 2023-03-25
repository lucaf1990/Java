package weeklyChallenge_2;


import lombok.Getter;


@Getter


public class Book extends Archive{
	String author;
	Enum<Genre_Enum> genre;
	
	public Book(String author,Enum<Genre_Enum> genre, Long ISBNcode, String titolo, int yearOfPublishing, int numberOfPages) {
		super(ISBNcode, titolo, yearOfPublishing, numberOfPages);		
			this.author=author;
			this.genre=genre;

	}
	
	
	  public String toString() { return "\n"+ "\nTitle: " + this.titolo+"\nAuthor: "+
	  this.author + "\nGenre: "+ this.genre + "\nNumber of pages: "+
	  this.numberOfPages +"\nYear of publishing: "+
	  this.yearOfPublishing+"\nISBN Code: "+ this.ISBNcode ;
	  
	  }
	 
	
}
