package esempio_3;

public class Persona {
String nome;
String cognome;
int eta;
String colorePref;
	
//Le classi hanno dei metodi 
//I metodi sono funzioni delle classi
//Le funzioni scritte in altr icontesti sono solo funzioni
//Una funzione scritta dentro alla classe è un METODO
//   un azione che esegue qeulla classe, sono funzioni/metodi
//   di quella specifica ovunque


//SCOPE raggio di azione in cui le variaibli possono essere chiamate 
// SCOPE GLOBALE - String nome; String cognome sono accessibili da tutta la classe 
// SCOPE LOCALE - int prova = 5;  quelle varibili definite fuori dal metodo 
Persona(String nome,String cognome,int eta,String colorePref){
	
	this.nome = nome;
	this.cognome= cognome;
	this.eta= eta;
	this.colorePref=colorePref;
}
 
public String toString() {
	String stringa = this.nome+ "\n" + this.cognome + "\n" + this.eta;
	return stringa;
}

   void saluta() {
	//int prova = 5;
	System.out.println("Ciao da "+ nome);
	

}
// COME PASSARE VARIABILI IN ALTRE FUNZIONI IN SCOPE LOCALE 	
	
   void addizione (int a, int b) {
	int ris = a+b;
	this.risultato(ris);
   }
   
	void risultato (int ris) {
		System.out.println(ris);
		
	}
   
   
//La classe è uno stampino che usiamo per stampare 
//  più persone. Per produrre le persone in Main
	



}
