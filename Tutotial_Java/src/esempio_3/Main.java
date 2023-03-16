package esempio_3;

import java.util.ArrayList;

public class Main {

		public static void main(String[] args) {
		
		
//ARRAY IN JAVA 
		
		int [] numeri = new int [3];
		numeri[0]=20;
		numeri[1]=50;
		numeri[2]=2;
		System.out.println(numeri[0]);
		numeri[2]=30;	
			
		int [] numeri_2 = { 10,20,20,30,40};
		
		for(int i=0; i<numeri.length; i++) {
			System.out.println(numeri[i]);
		}
		
		for (int numero: numeri) {
			System.out.println(numero);
		}
	
		
		
	
// ARRAY 2d MULTIDIMENSIONALI 
	
		//Sono Array di Array 
		
		
		String [][] classi = new String [3][3];
		classi[0][0]= "Luca";
		classi[0][1]= "Anna";				
		classi[0][2]= "Marco";
		
		classi[1][0]= "Piero";
		classi[1][1]= "Andrea";				
		classi[1][2]= "Stefano";
		
		classi[2][0]= "Paolo";
		classi[2][1]= "Arianna";				
		classi[2][2]= "Edoardo";
		
		System.out.println(classi[0][1]);
		
		classi[2][1]="Antonio";
		
		for(int classe=0; classe<classi.length;classe++) {
			System.out.println();
			for(int studente= 0; studente<classi[classe].length; studente++) {
				System.out.print(classi[classe][studente] +   " ");
				System.out.println();
			}
		}
		
		String [][] classi_2 = {
				
							{"Luca", "Anna","Marco"},
							{"Piero", "Andrea", "Stefano"},
							{"Paolo", "Arianna", "Edoardo" }
				
								};
		
		for(String[] classe: classi_2 ) {
			
			System.out.println();
			for (String studente: classe) {
				System.out.print(studente + " ");
				System.out.println();
			}
			
		};
		
		
		
		
		
	
	
//ARRAY LIST 
		
		for(int i=0; i<5;i++) {
			System.out.println(i);
		}
		
		
		ArrayList<String> persone= new ArrayList<String>();
		
		persone.add("Luca");		
		persone.add("Marco");		
		persone.add("Anna");		
		//System.out.println(persone.get(0));

		persone.set(2, "Giovanni");
		persone.remove(1);
		persone.clear();


		for (int i =0; i<persone.size(); i++) {
			System.out.println(persone.get(i));
		}
		
	
		
		
		
		
//ARRAYLIST DI ARRAYLIST (Bidimensionale)		
		
		ArrayList<ArrayList<String>> le_classi = new ArrayList();
		
		
		ArrayList<String> classe1= new ArrayList<String>();
		
		
		classe1.add("Luca");		
		classe1.add("Marco");		
		classe1.add("Anna");		
		
		ArrayList<String> classe2= new ArrayList<String>();
		
		classe2.add("Piero");		
		classe2.add("Simone");		
		classe2.add("Tania");
		
		le_classi.add(classe1);
		le_classi.add(classe2);
		
		for(int i = 0; i<le_classi.size(); i++) {
			System.out.println();
			for(int j= 0; j<le_classi.get(i).size();j++) {
				
				System.out.print(le_classi.get(i).get(j)+ " ");	
			}
			
		}	
		

		
		

// WRAPPER CLASS	
		
		System.out.println();
		String nome = "Luca";
		 
		// Usando le wrapper class diamo dei metodi alle primitive
		// vengono quindi trattate come reference ma il valore ultimo sarà 
		// il valore di una primitiva. 
		
		Boolean vero = true;
		boolean falso = false;
		Character carattere= 'b';
		char a = 'a';
		Integer number= 5;
		int numero = 5;
		double numberDouble= 5.75;
		Double numberDouble_2 = 6.75;
		
		
		
		
		if (number ==  numero) {
			System.out.println("Si, primitive e reference sono uguali");
		} else {
			System.out.println("Error");
		}
		
	
		

		
		
		
		
		
		
		
		
		

// METODI / FUNZIONI 
		
		//Blocchi di codice che faccia una serie di ripetizioni da scrivere e poter richiamare 
		
		
		//FUNZIONI 
		faiPasta();
		cucinoPranzo("le lasagne");
	
		
		//OVERLOADEDS METHOD
		int totSpeso= 	addizzione(5,2,20);
		System.out.println(totSpeso);
		
		int totSpeso_2 = addizzione(37,5);
		System.out.println(totSpeso_2);
		
		double totSpeso_3 = addizzione(2.5, 2.3);
		System.out.println(totSpeso_3);
		
		
		
		
	} // PARENTESI FINE MAIN 
		
		
		
		
		static void faiPasta () {
			System.out.println("Cucino");
		};
		
		static void cucinoPranzo (String cibo) {
			System.out.println("Cucino " + cibo);
		};
		

		
		
		
// OVEROLOAD METHODS
		// Usando combinazioni di parametri diversi posso creare metodi
		// usando lo stesso nome per più metodi 
		static int addizzione (int a, int b ) {
			int ris = a+b;
			return ris;
	
		};
		
		static int addizzione (int a, int b , int x) {
			int ris = a+b+x;
			return ris;
	
		};
		
		static double addizzione (double a, double b ) {
			double ris = a+b;
			return ris;
	
		};
		
		
		
		
		
		
		
		
		
		
		
}