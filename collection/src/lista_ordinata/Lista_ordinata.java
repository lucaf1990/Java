package lista_ordinata;
import java.util.*;

public class Lista_ordinata {
	
	public static Scanner scanner= new Scanner(System.in);
	public static void main(String []args) {
		List <Integer> num = 	generateCasuals();
		turnBackThisMFNumbers(num);
		System.out.println("Scegli true o false");
		boolean pari = scanner.nextBoolean();
		scanner.nextLine();
		stampaNumeri(num, pari );
		}
	public static List <Integer> generateCasuals() {
		int n;
		List <Integer> num = new ArrayList<Integer>();
		System.out.println("Inserisici la qnt di num da visualizzare");
		n= scanner.nextInt();
		scanner.nextLine();	
		
		for(int i=0; i<n; i++) {
			int cas= (int) (Math.random()*100);
			num.add(cas);
		}
		Collections.sort(num);
		System.out.println(num);
		return num;
	}
	public static List <Integer>  turnBackThisMFNumbers(List <Integer> numbers) {
		
		List<Integer> number= new ArrayList<>(numbers);
		Collections.reverse(number);
		number.addAll(numbers);
		System.out.println("");
		System.out.println("Numeri invertiti");
		System.out.println(number);
		return number;
		
	}
	public static void stampaNumeri (List <Integer> numbers, boolean pari){
		
		if(pari) {
			for(int i=0; i<numbers.size();i+=2) {
				System.out.println(numbers.get(i));	
			} 	
		} else { 
				for (int j=1; j<numbers.size(); j+=2) {
					System.out.println(numbers.get(j));	
			}
			
		}
	
	}
	
	
	
}
