package rubrica;
import java.util.*;
public class Rubrica_HashMap {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String []args) {
		
		getNameNum();
		
			
			
		}
	
	public static void getNameNum() {

	String name= scanner.nextLine(); 
	Integer phoneNum= scanner.nextInt();
	Map<String, Integer> rubrica= new HashMap<String,Integer>();
	rubrica.put(name, phoneNum);
	
	}
	
}
