package strutture_di_controllo;

import java.util.Scanner;

public class pari_dispari {
Scanner s = new Scanner(System.in);
boolean numberOfCaracters;
String myString;

public void pariDispari() {
	
	for(int i = 0; i < 2; i++) {
		
	
	System.out.println("inserisci una stringa");
	myString= s.next();
	if(myString.length()%2==0) {
		numberOfCaracters = true;
		System.out.println("il numero è pari?: " + numberOfCaracters);
	}else {
		numberOfCaracters = false;
		System.out.println("il numero è pari?: " + numberOfCaracters);
	}
	
	}
}
}
