package gas;

import java.util.Scanner;

public class GasKmCalc extends Exception {
	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
	    
	   
		while(true) {
			try {
				calcolo("prova 1");
				break;
			} catch (Below_zero_Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Qnt minima lt 1 litro - Riprova ");
				System.out.println("\n");
			}
		}
	}
	
	    
	public static void calcolo(String message) throws Below_zero_Exception {
		
		double km;
		double lt;
		System.out.println("Calcola il consumo del tuo veicolo");
	    System.out.println("Inserisci i km percorsi");
	    km= scanner.nextInt();
		System.out.println("Inserisci i lt consumati");
		lt= scanner.nextInt();
		if(lt==0 || lt<0) {
			   throw new Below_zero_Exception(message);
			   
		   } else {
			   double consumo = km/lt;
			   System.out.print("Il tuo consumo risulta essere stato di: "+consumo + " Km/Lt");
		   }
	   
	   
		
	   
	   
	}
}
