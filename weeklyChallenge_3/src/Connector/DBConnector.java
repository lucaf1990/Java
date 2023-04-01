package Connector;

import model.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;

import enum_project.Genre_Enum;
import enum_project.Magazine_enum_frequency;
import util.JpaUtil;

public class DBConnector {

	public static void main(String[] args) {

		Book book_0 = new Book("Michael Crichton", Genre_Enum.Development, "The Way I See It", 2017, 151);
		Book book_1 = new Book("Dante", Genre_Enum.Adventure, "Business of Sports: The Winning Formula for Success",
				2015, 175);
		Book book_2 = new Book("Ruskin Bon", Genre_Enum.Motivational, "Fearless Governance", 2018, 124);
		Book book_3 = new Book("Lewis Carrol", Genre_Enum.Fantasy, "Let us Dream", 2008, 321);
		Book book_4 = new Book("Jawaharlal Nehru", Genre_Enum.Art, "The Endgame", 2018, 875);
		Book book_5 = new Book("Cervantes", Genre_Enum.Historical, "The White Book", 1997, 245);
		Book book_6 = new Book("Jawaharlal Nehru", Genre_Enum.Art, "The Way I See It", 2017, 151);
		Book book_7 = new Book("H.G. Wells", Genre_Enum.Motivational, "Your Best Day is Today!", 2004, 423);
		Book book_8 = new Book("Michael Crichton", Genre_Enum.Development, "Connecting, Communicating, Changing", 2022,
				55);

		Magazine magazine_0 = new Magazine(Magazine_enum_frequency.Weekly, "Automotive News", 2002, 61);
		Magazine magazine_1 = new Magazine(Magazine_enum_frequency.Biannul, "Forbes", 1984, 41);
		Magazine magazine_2 = new Magazine(Magazine_enum_frequency.Monthly, "Discovery Girls", 2007, 74);
		Magazine magazine_3 = new Magazine(Magazine_enum_frequency.Weekly, "National Geographic", 2001, 76);
		Magazine magazine_4 = new Magazine(Magazine_enum_frequency.Weekly, "Entertainment Weekly", 1994, 53);
		Magazine magazine_5 = new Magazine(Magazine_enum_frequency.Biannul, "Smithsonian", 1974, 68);
		Magazine magazine_6 = new Magazine(Magazine_enum_frequency.Weekly, "People", 2001, 83);
		Magazine magazine_7 = new Magazine(Magazine_enum_frequency.Weekly, "Vouge", 1991, 101);
		Magazine magazine_8 = new Magazine(Magazine_enum_frequency.Weekly, "Why", 2021, 105);

		

		User myUser= new User("Luca","Forma",LocalDate.of(1990, 06, 11));
		User myUser1= new User("Kevin","Fuccio",LocalDate.of(2002, 11, 21));
		User myUser2= new User("Daniele","Testi",LocalDate.of(1998, 01, 05));
		User myUser3= new User("Alberto","Macis",LocalDate.of(1992, 05, 27));
		User myUser4= new User("Anna","Rossi",LocalDate.of(1990, 07, 11));
		
		
		Loan_Catalogue myLoan_0= new Loan_Catalogue(Catalogue.getIdForLoan(1l),Catalogue.getBookForLoan(1l),LocalDate.of(2023, 01, 28),LocalDate.of(2023, 03, 05));
		Loan_Catalogue myLoan_1= new Loan_Catalogue(Catalogue.getIdForLoan(2l),Catalogue.getBookForLoan(2l), LocalDate.of(2023, 02, 28), null);
		Loan_Catalogue myLoan_2= new Loan_Catalogue(Catalogue.getIdForLoan(3l), Catalogue.getBookForLoan(5l),LocalDate.of(2023, 02, 10),LocalDate.of(2023, 02, 25));
		Loan_Catalogue myLoan_3= new Loan_Catalogue(Catalogue.getIdForLoan(4l), Catalogue.getBookForLoan(7l),LocalDate.of(2023, 02, 12),LocalDate.of(2023, 03, 10));
		
		Loan_Catalogue myLoan_4= new Loan_Catalogue(Catalogue.getIdForLoan(1l), Catalogue.getBookForLoan(9l),LocalDate.of(2023, 03, 10),null);
		Loan_Catalogue myLoan_5= new Loan_Catalogue(Catalogue.getIdForLoan(4l), Catalogue.getBookForLoan(3l),LocalDate.of(2023, 04, 01),null);
		Loan_Catalogue myLoan_6= new Loan_Catalogue(Catalogue.getIdForLoan(3l), Catalogue.getBookForLoan(4l),LocalDate.of(2023, 04, 1),null);
		
		List<Archive> myList = null;

//  METODO PER AGGIUNGERE UN ELEMENTO AL CATALOGO 

		//Catalogue.addToCat(magazine_...);

// 	METODO PER ELIMINARE UN ELEMENTO DAL CATALOGO TRAMITE ISBN 	 
		// Catalogue.delete(17l);

//	METODO PER CERCARE UN ELEMENTO DAL CATALOGO TRAMITE ISBN 	 		 
		// Catalogue.getElementByISBN(15l);

//	METODO PER CERCARE UN ELEMENTO DAL CATALOGO TRAMITE ANNO DI PUBBLICAZIONE			 

		
		 /*try { myList = Catalogue.getElementByYear(2001); } catch (IOException e) {
		 // TODO Auto-generated catch block e.printStackTrace(); }
		 myList.forEach(bm->System.out.println(bm));
		 */

//	METODO PER CERCARE UN ELEMENTO DAL CATALOGO TRAMITE AUTORE			

			/*
			 * try { myList = Catalogue.getElementByAuthor("Michael Crichton"); }
			 * catch(IOException e) { //TODO Auto-generated e.printStackTrace(); }
			 * 
			 * 
			 * myList.forEach(bm->System.out.println(bm));
			 * 
			 */
//	METODO PER CERCARE UN ELEMENTO DAL CATALOGO TRAMITE TITOLO O PARTE DEL TITOLO 
		
			
			/*
			 * List<Archive> myList; try { myList = Catalogue.getElementByTitle("geo");
			 * System.out.println("\n"+myList); } catch (IOException e) { //
			 * TODOAuto-generated catch block e.printStackTrace(); }
			 */

//  AGGIUNGO USER ALLA MIA TABELLA USER 
			
			/* Catalogue.addUser(myUser);
			 Catalogue.addUser(myUser1);
			 Catalogue.addUser(myUser2);
			 Catalogue.addUser(myUser3);
			 Catalogue.addUser(myUser4);*/
			 
		
//  AGGIUNGO ELEMENTI LOAN ALLA MIA TABELLA LOAN 
			/*
			 * try { Catalogue.addLoan(myLoan_1); Catalogue.addLoan(myLoan_2);
			 * Catalogue.addLoan(myLoan_3); Catalogue.addLoan(myLoan_4);
			 * Catalogue.addLoan(myLoan_5); Catalogue.addLoan(myLoan_6);
			 * 
			 * } catch (IOException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */
			 
// 
		
		
			/*
			 * try { System.out.println(Catalogue.getElementStillLoaned());
			 * 
			 * } catch (IOException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */
		
			 try {
				System.out.println(Catalogue.getElementByMemebership(3l));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		  
		 }

}
