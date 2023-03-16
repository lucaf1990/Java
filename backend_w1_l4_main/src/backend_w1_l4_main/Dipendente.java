package backend_w1_l4_main;

import java.util.Scanner;

public class Dipendente {

	// PUBLIC VAR
	public double stipendioBase= 1000;
	// PRIVATE VAR
	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	// ENUM
	private Livello livello= Livello.NON_ASSEGNATO;
	private Dipartimento dipartimento= Dipartimento.NON_ASSSEGNATO;
	Scanner scanner = new Scanner(System.in);
   public  Dipendente(int matricola_dipenedente, Dipartimento dipartimento_dipendente) {
	   this.stipendio= stipendioBase;
	   this.importoOrarioStraordinario= 30;
	   this.livello= Livello.OPERAIO;
	   this.dipartimento= dipartimento_dipendente;
	   this.matricola= matricola_dipenedente;
   }
   
public Dipendente(double stipendio_dipendente, Livello livello_dipendente, double straordinario_dipendente
		, Dipartimento dipartimento_dipendente, int matricola_dipendente) {
		this.stipendio= stipendio_dipendente;
		this.importoOrarioStraordinario= straordinario_dipendente;
		this.livello= livello_dipendente;
		this.dipartimento= dipartimento_dipendente;
		this.matricola= matricola_dipendente;
	   
   }

public String toString() {
	String stringa = this.livello + "\n" + this.stipendio + "\n" + this.importoOrarioStraordinario + "\n" + this.matricola + "\n" + this.dipartimento;
	return stringa;
}
public void StampaDati() {
	System.out.println(toString());
}

public void promuovi() {
	switch(this.livello) {
	case DIRIGENTE:
		this.livello= Livello.DIRIGENTE;
		this.stipendio= this.stipendio*1;
		System.out.print("E'già un dirigente!");
		break;
	case OPERAIO:
		this.livello= Livello.IMPIEGATO;
		this.stipendio= this.stipendio*1.2;
		break;
	case IMPIEGATO:
		this.livello= Livello.QUADRO;
		this.stipendio= this.stipendio * 1.5;
		break;
	case QUADRO:
		this.livello= Livello.DIRIGENTE;
		this.stipendio= this.stipendio *2;
		break;
	default:
		break;
	
	}
	
}

static double calcolaPaga(Dipendente dipendente) {
	
	double stipendio= dipendente.stipendio;
	return stipendio;
	
}

static double calcolaPagaconStraordinari(Dipendente dipendente, double ore_straordinarie) {
	double calcolo = dipendente.importoOrarioStraordinario * ore_straordinarie;
	double somma= dipendente.stipendio+ calcolo;
	return somma;
	
}

}
