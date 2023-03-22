package asyncJava;

public class Es_1_Main_Thread implements Runnable {
	
	public static void main(String[] args) {
		
		Es_1_Main_Thread t1= new Es_1_Main_Thread("*",10);
		Es_1_Main_Thread t2= new Es_1_Main_Thread("#",10);
		
		
		Thread r1= new Thread(t1);
	
		Thread r2= new Thread(t2);
	
		//Thread r3= new Thread(new Es_1_Main_Thread("2",10));
	
		
		r1.start();
		r2.start();
		
	}
	
	String symbol;
	int n=10;
	
	
	public Es_1_Main_Thread (String symbol, int n) {
		this.symbol=symbol;
		this.n=n;
	}
	
		
	
	@Override
	public void run() {
	   for(int i = 0; i<n; i++) {
		   System.out.println(this.symbol);
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		   
	   }
		
	}

}
