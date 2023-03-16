package esempio_3;

public class Main_2 {
	public static void main(String[] args) {
	
		
	Persona persona_0 = new Persona("Luca","Forma",32,"Nero");	
	Persona persona_1 = new Persona("Edoardo", "Ciao", 25, "Rosso");
	
	System.out.println(persona_0);
	System.out.println(persona_1.nome);
	persona_0.saluta();
	
	
	Pizza pizza1= new Pizza("integrale", "pomodoro", "mozzarella", "ananas");
	Pizza pizza2= new Pizza("integrale");
	Pizza pizza3= new Pizza("integrale", "pomodoro", "mozzarella");
	Pizza pizza4= new Pizza("integrale", "pomodoro");
	
	
	
		
	}
	
	
	
	
}
