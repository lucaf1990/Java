package strutture_di_controllo;

import java.util.Scanner;


public class whilee {
	Scanner s = new Scanner(System.in);
	String myString;
	
	
	public void whileee() {
		do {
			System.out.println("inserisci una stringa");
			myString= s.next();
			String[] letters = myString.split("");
			System.out.println(String.join(",", letters));
			
		}while(!myString.equals("q") );
			
	}
	
}

