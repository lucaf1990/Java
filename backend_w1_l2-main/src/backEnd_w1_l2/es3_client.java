package backEnd_w1_l2;

import java.util.Scanner;

public class es3_client {
	
private static Scanner s = new Scanner(System.in);

String name;
String email;
int codC;
int date;

public es3_client() {
	this.name = NameSurname();
	this.email= email();
	this.codC=codCliente();
	this.date= dateI();
}


private static String  NameSurname() {
	
	System.out.println("Inserisci Nome e Cognome");
	String name = s.nextLine();
	return name;
}

private static String email() {
	
	System.out.println("Inserisci la email");
	String email = s.nextLine();
	return email;
}

private static int codCliente() {
		
        System.out.println("Inserisci il codice cliente");
        int codC = s.nextInt();
        return codC;
	}
	
private static int dateI() {
		Scanner s = new Scanner(System.in);
        System.out.println("Inserisci la data");
        int date = s.nextInt();
        return date;
	}
}
