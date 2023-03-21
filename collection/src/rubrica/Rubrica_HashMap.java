package rubrica;
import java.util.*;
public class Rubrica_HashMap {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String []args) {
		
		Map<String, Integer> rubrica=getNameNum();
		findNumber(rubrica);
		findName(rubrica);
		deleteFromName(rubrica);
		tuttiIContatti(rubrica);
		}
	
	public static Map<String, Integer> getNameNum() {
    System.out.println("AGGIUNGI CONTATTO IN RUBRICA");
    System.out.println("QUANTI CONTATTI VUOI AGGIUNGERE");
    int numero= scanner.nextInt();
    scanner.nextLine();
    Map<String, Integer> rubrica= new HashMap<String,Integer>();
    for(int i = 0; i<numero; i++) {
    	System.out.println("INSERIRE NOME");
    	String name= scanner.nextLine(); 
        System.out.println("INSERIRE NUMERO DI TELEFONO");
    	Integer phoneNum= scanner.nextInt();
    	scanner.nextLine();
    	

    	rubrica.put(name, phoneNum);
    }
    
	System.out.println("\n"+rubrica);
	return rubrica;
	}
	
	public static Map<String, Integer> deleteFromName(Map<String, Integer> rubrica ) {
		System.out.println("inserisci il nome da eliminare");
		String userInp= scanner.nextLine();
		if(rubrica.containsKey(userInp)) {
			rubrica.remove(userInp);
			
		}
		
		System.out.print("I tuoi contatti in rubrica sono: "+rubrica);
		return rubrica;
	}
	
	public static void findNumber(Map<String, Integer> rubrica){
	    System.out.println("INSERIRE NUMERO");
	    Integer userInp= scanner.nextInt();
	    scanner.nextLine();

	    for (Map.Entry<String, Integer> entry : rubrica.entrySet()) {
	        if (entry.getValue().equals(userInp)) {
	            System.out.println("Il numero " + userInp + " corrisponde al contatto " + entry.getKey());
	            return;
	        }
	    }
	    System.out.println("Il numero " + userInp + " non è presente in rubrica.");
	}
	
	public static void findName(Map<String, Integer> rubrica){
		 System.out.println("INSERIRE NOME");
		String userInp= scanner.nextLine();
	
		for (Map.Entry<String, Integer> entry : rubrica.entrySet()) {
	        if (entry.getKey().equals(userInp)) {
	            System.out.println("Il nome " + userInp + " corrisponde al contatto " + entry.getValue());
	            return;
	        }
	    }
	    System.out.println("Il nome " + userInp + " non è presente in rubrica.");
		
		
			}
	
	public static void tuttiIContatti(Map<String, Integer> rubrica) {
		
		System.out.println(rubrica);
	}
	
	
	
}
