package gas;

public class GasKm_Info extends Exception {

	double km;
	double lt;
	
	public GasKm_Info(double km, double lt) {
		this.km=km;
		this.lt=lt;
	}
	
	
	
}
