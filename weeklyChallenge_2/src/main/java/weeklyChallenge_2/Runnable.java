package weeklyChallenge_2;
import java.io.IOException;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Runnable {
public static Scanner scanner= new Scanner(System.in);

public static void main(String[] Args) {
	
	
	
	 Book book_0= new Book("Michael Crichton",Genre_Enum.Development,10000l,"The Way I See It",2017l,151);
	 Book book_1= new Book("Dante", Genre_Enum.Adventure,10001l,"Business of Sports: The Winning Formula for Success",2015l,175);
	 Book book_2 = new Book("Ruskin Bon", Genre_Enum.Motivational,10002l,"Fearless Governance",2018l,124);
	 Book book_3 = new Book("Lewis Carrol", Genre_Enum.Fantasy,10003l,"Let us Dream",2008l,321); 
	 Book book_4 = new Book("Jawaharlal Nehru", Genre_Enum.Art,10004l,"The Endgame",2018l,875  );
	 Book book_5 = new Book("Cervantes", Genre_Enum.Historical,10005l,"The White Book",1997l,245 );
	 Book book_6 = new Book("Jawaharlal Nehru", Genre_Enum.Art,10006l,"The Way I See It",2017l,151  );
	 Book book_7 = new Book("H.G. Wells", Genre_Enum.Motivational,10007l,"Your Best Day is Today!",2004l,423  );
	 Book book_8 = new Book("Michael Crichton",Genre_Enum.Development,10010l,"Connecting, Communicating, Changing",2022l,55  );
	
	 Magazine magazine_0= new Magazine(Magazine_enum_frequency.Weekly,10011l,"Automotive News",2002l,61); 
	 Magazine magazine_1= new Magazine(Magazine_enum_frequency.Biannul,10012l,"Forbes",1984l,41); 
	 Magazine magazine_2= new Magazine(Magazine_enum_frequency.Monthly,10013l,"Discovery Girls",2007l,74);
	 Magazine magazine_3= new Magazine(Magazine_enum_frequency.Weekly,100014l,"National Geographic",2001l,76); 
	 Magazine magazine_4= new Magazine(Magazine_enum_frequency.Weekly,10015l,"Entertainment Weekly",1994l,53);
	 Magazine magazine_5= new Magazine(Magazine_enum_frequency.Biannul,10016l,"Smithsonian",1974l,68); 
	 Magazine magazine_6= new Magazine(Magazine_enum_frequency.Weekly,10017l,"People",2001l,83);
	 Magazine magazine_7= new Magazine(Magazine_enum_frequency.Weekly,10018l,"Vouge",1991l,101); 
	 Magazine magazine_8= new Magazine(Magazine_enum_frequency.Weekly,10019l,"Why",2021l,105);
	
	
	 
	 
	 Catalogue myCatalogue = new Catalogue();
	 
	 //ESERCIZIO UNO RICHIAMO ADDTOCAT PER AGGIUNGERE GLI ELEMENTI CREATI AL CATALOGO
	 
	 
	 myCatalogue.addToCat(book_0);
	 myCatalogue.addToCat(book_1);
	 myCatalogue.addToCat(book_2);
	 myCatalogue.addToCat(book_3);
	 myCatalogue.addToCat(book_4);
	 myCatalogue.addToCat(book_5);
	 myCatalogue.addToCat(book_6);
	 myCatalogue.addToCat(book_7);
	 myCatalogue.addToCat(book_8);
	 
	 myCatalogue.addToCat(magazine_0);
	 myCatalogue.addToCat(magazine_1);
	 myCatalogue.addToCat(magazine_2);
	 myCatalogue.addToCat(magazine_3);
	 myCatalogue.addToCat(magazine_4);
	 myCatalogue.addToCat(magazine_5);
	 myCatalogue.addToCat(magazine_6);
	 myCatalogue.addToCat(magazine_7);
	 myCatalogue.addToCat(magazine_8);
	
	 
	 // ESERCIZIO DUE RICHIAMO LA FUNZIONE DELETEFROMISBN PER ANDARE A ELIMINARE TRAMITE ISBN
	 
	 myCatalogue.deleteFromISBN(10000l);
	 myCatalogue.deleteFromISBN(10001l);
	 myCatalogue.deleteFromISBN(10002l);
	 myCatalogue.deleteFromISBN(10003l);
	 myCatalogue.deleteFromISBN(10004l);
	 myCatalogue.deleteFromISBN(10005l);
	 
	 System.out.println(myCatalogue);
	 
	 
	 
	// ESERCIZIO TRE RICHIAMO LA FUNZIONE searchForISBN PER ANDARE A CERCARE TRAMITE CODICE ISBN
	
	 myCatalogue.searchForISBN(10011l);
	 myCatalogue.searchForISBN(10010l);
	 myCatalogue.searchForISBN(10006l);
	 myCatalogue.searchForISBN(10007l);

	 
	 
	// ESERCIZIO QUATTRO RICHIAMO LA FUNZIONE searchForYear PER ANDARE A CERCARE TRAMITE L'ANNO
	 
	 myCatalogue.searchForYears(2004l);
	 myCatalogue.searchForYears(1994l);
	 myCatalogue.searchForYears(2021l);
	 myCatalogue.searchForYears(1991l);
	 
	 
	 try {
		Catalogue.writeFile(myCatalogue);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

}