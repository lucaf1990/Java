package weeklyChallenge_2;





public class Magazine extends Archive {
	Enum<Magazine_enum_frequency> frequencyOfPublishing;
public Magazine(Enum<Magazine_enum_frequency> frequencyOfPublishing,Long ISBNcode, String titolo, int yearOfPublishing, int numberOfPages) {
		super(ISBNcode, titolo, yearOfPublishing, numberOfPages);
			this.frequencyOfPublishing=frequencyOfPublishing;
	}

public String toString() {
	return"\n"+ "\nTitle: " + this.titolo+"\nFrequency of publishing: "+ this.frequencyOfPublishing + "\nNumber of pages: "+ this.numberOfPages +"\nYear of publishing: "+ this.yearOfPublishing+"\nISBN Code: "+ this.ISBNcode;
	
}


	
	
}
