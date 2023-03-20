package error;

import java.util.Arrays;
import java.util.Scanner;

public class Runnable extends Exception{

	static Scanner scanner= new Scanner(System.in);
	static int [] numbers= new int[5];
	public static void main(String[] args) throws Exception {
			for(int i =0; i<numbers.length; i++) {
				int number = (int) (Math.random() * 10)+1;
				numbers[i]=number;
				}
			
			System.out.println(Arrays.toString(numbers));
			System.out.println(".. here are your casual numbers");
			
			
			while(true) {
				try {
					aggiungiNum
					("Error");
					break;
					}
				
				catch(Invalid_num_Exception e) {
					System.out.println("num non valido");
					
				
					
				} catch(Exit_Exception e) { 
					System.out.println("Fine!");
					break;
				
					
				} catch(Number_Exception e) {
					System.out.println("Number must be a number between 1 and 10");
				} 
			} 
	}
	
	public static void aggiungiNum(String message ) throws Exception, Exit_Exception {
		int arrayPosition;
		
		System.out.println("Chose the position to place your number - 0 to Exit");
		arrayPosition= scanner.nextInt();
		
			if (arrayPosition== 0) {
				throw new Exit_Exception(message);
			}else if(arrayPosition<1 || arrayPosition>5) {
				throw new Invalid_num_Exception (message);
			} else {
				System.out.println("Choose the number to replace between 1 and 10");
				
		        int num = scanner.nextInt();
		        if(num < 1 || num> 10) {
		        	throw new Number_Exception (message);
		        } else {
		        	numbers[arrayPosition - 1] = num;
			        System.out.println("Number " + num + " added to position " + arrayPosition);
			        System.out.println(Arrays.toString(numbers));
			        
		        	
		        }
		        
		    }
	}
}
