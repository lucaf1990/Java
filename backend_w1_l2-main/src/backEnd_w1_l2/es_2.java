package backEnd_w1_l2;

import java.util.Arrays;
import java.util.Scanner;

public class es_2 {
	
int tel;
double credito =0;
int[][] lastCalls;

public int getTelefono() {
	Scanner s = new Scanner(System.in);
	System.out.println("inserisci il numero di telefono");
	int n = s.nextInt();
	System.out.println("numero: " + n);
	System.out.println("il tuo credito residuo è: "+ credito + " €");
	return n;
}

public void calls() {
	
	int [][] MyLastCalls= {
			{43436454, 10},
			{43438768, 20},
			{54439787, 12},
			{87437688, 40},
			{42328578, 21}
			
	};
	 for (int i = 0; i < MyLastCalls.length; i++) {
	        for (int j = 0; j < MyLastCalls[i].length; j++) {
	            System.out.print(MyLastCalls[i][j] + " ");
	        }
	        System.out.println("min");
	    
	    }
}
	
}
