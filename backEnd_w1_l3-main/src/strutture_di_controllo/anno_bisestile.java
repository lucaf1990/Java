package strutture_di_controllo;

import java.util.Scanner;

public class anno_bisestile {
	Scanner s = new Scanner(System.in);
	boolean isBisestile;
	int anno;
	
	public void annoBisestile() {
		for(int i = 0; i < 2; i++) {
			System.out.println("inserisci un anno");
			anno= s.nextInt();
			if((anno%4==0) || ( (anno%100==0) && (anno%400==0) )) {
				isBisestile = true;
				System.out.println("l'anno è bisestile?: " + isBisestile);
			}else {
				isBisestile = false;
				System.out.println("l'anno è bisestile?: " + isBisestile);
			}
		}
	}
}
