package backEnd_w1_l2;

public class w1_l2 {

	public static void main(String[] args) {
		// esercizio 1
		rettangolo r1= new rettangolo(2,3);
		
		System.out.println("il perimetro del rettangolo è: "+ r1.getPerimetro());
		
		System.out.println("l'area del rettangolo è: "+ r1.getArea());
		
		rettangolo r2= new rettangolo(4,6);
		
		System.out.println("il perimetro del rettangolo è: "+ r2.getPerimetro());
		
		System.out.println("l'area del rettangolo è: "+ r2.getArea());
		
		System.out.println("la somma del perimetro dei rettangoli è: "+ (r1.getPerimetro()+ r2.getPerimetro()));
		
		System.out.println("la somma delle aree dei rettangoli è: "+ (r1.getArea() + r2.getArea()));
	}

	
}
