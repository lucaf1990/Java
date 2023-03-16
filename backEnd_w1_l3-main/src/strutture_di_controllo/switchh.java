package strutture_di_controllo;

import java.util.Scanner;

public class switchh {
	Scanner s = new Scanner(System.in);

	int number;
	
	public void switchhh() {
	
		for(int i = 0; i < 3; i++) {
			System.out.println("inserisci un numero");
			number= s.nextInt();
			switch(number) {
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("uno");
				break;	
			case 2:
				System.out.println("due");
				break;	
			case 3:
				System.out.println("tre");
				break;	
			default :
				System.out.println("error");
				
			}
		}
	}
}
