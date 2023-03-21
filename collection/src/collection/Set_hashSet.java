package collection;

import java.util.*;
public class Set_hashSet {
public static Scanner scanner= new Scanner(System.in);
	
	public static void main(String []args) {
		
	gestireParole();
		
		
	}
	public static void gestireParole() {
		
		Set<String> wordsList= new HashSet<String>();
		Set<String> wordsList_2= new HashSet<String>();
		int numEle;
		System.out.println("Inserisci il numero di elementi");
		numEle= scanner.nextInt();
		scanner.nextLine();
		for(int i=1; i<=numEle; i++) {
		System.out.println("Inserisci la parola"+ i);
		String input= scanner.nextLine();
		if(!wordsList.add(input)) {
			wordsList_2.add(input);
		}
		
		
	}   System.out.println(wordsList_2);
		System.out.println(wordsList.size());
		System.out.println(wordsList);
		
		
		
	
}
	
}
