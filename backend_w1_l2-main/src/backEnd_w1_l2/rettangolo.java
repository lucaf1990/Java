package backEnd_w1_l2;

public class rettangolo {

	double base, altezza;
	
	public rettangolo(double base, double altezza) {
		base=base;
		altezza=altezza;
	}
	
	public double getPerimetro() {
		double p = ((base+altezza)*2);
		return p;
	}
	
	public double getArea() {
	double a = base*altezza;
	return a;
	}
	
	
	}
