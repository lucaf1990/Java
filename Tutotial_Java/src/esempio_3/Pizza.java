package esempio_3;

public class Pizza {

	String impasto;
	String salsa;
	String formaggio;
	String extra;
	String extra2;
	
	Pizza(String impasto){
		this.impasto= impasto;
		System.out.println(impasto);
	}
	Pizza(String impasto,String salsa){
		this.impasto= impasto;
		this.salsa= salsa;
		System.out.println(impasto+salsa);
	}
	
	Pizza(String impasto,String salsa,String formaggio){
		this.impasto= impasto;
		this.salsa= salsa;
		this.formaggio= formaggio;
		System.out.println(impasto+salsa+formaggio);
	}
	
	Pizza(String impasto,String salsa,String formaggio,String extra){
		this.impasto= impasto;
		this.salsa= salsa;
		this.formaggio= formaggio;
		this.extra= extra;
		System.out.println(impasto+salsa+formaggio+extra);
		
	}
	Pizza(String impasto,String salsa,String formaggio,String extra, String extra2){
		this.impasto= impasto;
		this.salsa= salsa;
		this.formaggio= formaggio;
		this.extra= extra;
		this.extra2=extra2;
		
	}
	
	
}
