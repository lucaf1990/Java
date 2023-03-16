package backend_w1_l4_main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dipendente dip_1 = new Dipendente(1752.25, Livello.OPERAIO,30,Dipartimento.AMMINISTRAZIONE, 01);
		Dipendente dip_2 = new Dipendente(2552.83, Livello.QUADRO,30,Dipartimento.PRODUZIONE, 02);
		Dipendente dip_3 = new Dipendente(1352.72, Livello.IMPIEGATO,30,Dipartimento.VENDITE, 03);
		
		Dipendente dip_4 = new Dipendente(1532, Livello.DIRIGENTE,30,Dipartimento.VENDITE, 04);
		System.out.println(" ");
		System.out.println(Dipendente.calcolaPaga(dip_4));
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(Dipendente.calcolaPagaconStraordinari(dip_4, 20));
		System.out.println(" ");System.out.println(" ");
		dip_1.StampaDati();
		dip_1.promuovi();
		System.out.println(" ");
		dip_1.StampaDati();
		System.out.println(" ");
		System.out.println(" ");
		dip_2.StampaDati();
		dip_2.promuovi();
		System.out.println(" ");
		dip_2.StampaDati();
		System.out.println(" ");
		System.out.println(" ");
		dip_3.StampaDati();
		dip_3.promuovi();
		System.out.println(" ");
		dip_3.StampaDati();
		System.out.println(" ");
		System.out.println(" ");
		dip_4.StampaDati();
		dip_4.promuovi();
		System.out.println(" ");
		dip_4.StampaDati();
		System.out.println(" ");
		System.out.println(" ");
		
		
	
		
		
		Dipendente dip_5= new Dipendente(05, Dipartimento.VENDITE);
		Dipendente dip_6= new Dipendente(06, Dipartimento.PRODUZIONE);
		Dipendente dip_7= new Dipendente(07, Dipartimento.AMMINISTRAZIONE);
		Dipendente dip_10= new Dipendente(10, Dipartimento.VENDITE);
		dip_5.StampaDati();
		dip_5.promuovi();
		System.out.println(" ");
		dip_5.StampaDati();
		System.out.println(" ");
		System.out.println(" ");
		dip_6.StampaDati();
		dip_6.promuovi();
		System.out.println(" ");
		dip_6.StampaDati();
		System.out.println(" ");
		
		System.out.println(" ");
		dip_7.StampaDati();
		dip_7.promuovi();
		System.out.println(" ");
		dip_7.StampaDati();
		System.out.println(" ");
		System.out.println(" ");
		dip_10.StampaDati();
		dip_10.promuovi();
		System.out.println(" ");
		dip_10.StampaDati();
		System.out.println(" ");
		System.out.println(" ");
		
	}

}
