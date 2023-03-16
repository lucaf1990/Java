package strutture_di_controllo;

import java.util.Scanner;

public class conto_alla_rovescia {
	int number;
	Scanner s = new Scanner(System.in);
	
	public void ContoAllaRovescia() {
        
		for(int i = 0; i < 2; i++) {
			
			System.out.println("Inserisci un numero: ");
			number = s.nextInt();
			
			for(int j=number; j>0; j--) {
				System.out.println(j);
			}
		}
    }
}
