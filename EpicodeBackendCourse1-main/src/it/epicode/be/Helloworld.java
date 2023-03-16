package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;


public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		//<<<<<<<<<<<<<<<<<<<<<<<<<ESERICIZI PER CASA>>>>>>>>>>>>>>>>>>>>>>>>>
		
		
		//Esercizo 1 -2
		
		System.out.println("\n Esericizi per casa: \n ");
		
		
		int aa = 10;
		int bb = 2;
		
		String text= "aa moltiplicato per bb da come risultato: ";
		
		System.out.println(text + aa*bb+ "\n");
		
		String myArr[] = {"a","b","d","e","f"};
		
		String addToArray = "c";
		
		String[] newArray = new String[myArr.length +1];
		for (int i =0, j= 0; i < newArray.length; i++) {
			if(i==2)
			{
				newArray[i] = addToArray;
			}else {
			newArray[i] = myArr[j];
			j++;
		}
		}
		
		
		System.out.println(Arrays.toString(newArray) + "\n");
		
		
		//Esercizo 3
		String[] arr= leggiStringhe();
			
		 Scanner s = new Scanner(System.in);
			
		static String[] = leggiStringhe() {
			String[] stringhe = new String[3];
			
			System.out.println("inserisci stringa1");
			
		}
		
		String text1= "questo ";
		String text2= "è il ";
		String text3= "terzo esercizio: ";
		
		System.out.println(text1 + text2 + text3+ "\n" );
		System.out.println(text3 + text2 + text1+ "\n" );
		
		
		//esercizio 4
		
		int lat1 = 10;
		int lat2 = 5;
		
		String text4= "il perimetro del rettangolo è di: ";
		System.out.println(text4 + ((lat1+lat2)*2) + "\n");
		
		
		System.out.println("il resto del primo lato è: "+ lat1 % 2 +"\n");
		System.out.println("il resto del secondo lato è: "+ lat2 % 2 + "\n");
		
		double base = 2.50;
		double altezza = 4.20;
		
		
		
		System.out.println("L'area del triangolo è : " + (base*altezza/2) +"\n");
		}

private static String[] leggiStringhe() {
	// TODO Auto-generated method stub
	return null;
}
}



