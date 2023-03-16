package backEnd_w1_l2;

import java.util.Scanner;

public class es3 {
	private static Scanner s = new Scanner(System.in);

	int codiceArticolo;
	String descrizione;
	int prezzo;
	int disponibilità;

	public es3() {
		this.codiceArticolo = codArticle();
		this.descrizione= descrizione();
		this.prezzo=prezzo();
		this.disponibilità= disponibilità() ;
	}

	private static int codArticle() {
		
        System.out.println("Inserisci il numero dell'articolo");
        int codArt = s.nextInt();
        return codArt;
        
	}
	public String  descrizione() {
	
        System.out.println("Inserisci la descrizione");
       String des = s.nextLine();
       return des;
	}
	public int prezzo() {
		
        System.out.println("Inserisci il prezzo");
        int price = s.nextInt();
        return price;
	}
	public int disponibilità() {
		
        System.out.println("Inserisci il numero di articoli");
        int disp = s.nextInt();
        return disp;
	}
	
	}

