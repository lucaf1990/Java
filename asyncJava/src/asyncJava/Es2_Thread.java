package asyncJava;

import java.util.Arrays;

public class Es2_Thread implements Runnable{

	private int start;
	private int end;
	private int[] num;
	
	static int [] partialSum= new int[3];
	
	public Es2_Thread(int[] num, int start, int end) {
		this.num=num;
		this.start=start;
		this.end=end;
	}


	@Override
	public void run() {
		
		int sum=0;
		for(int i=start; i<end; i++) {
			sum += num[i];
		
		}
		if(start==0) {
			
			partialSum[0]=sum;
			
			
				System.out.println("La somma di questi numeri è: "+sum);
		} else if(start==1000) {
			partialSum[1]=sum;
			System.out.println("La somma di questi numeri è: "+sum);
		} else if(start==2000) {
			partialSum[2]=sum;
			System.out.println("La somma di questi numeri è: "+sum);
		}
		
		
		
	}

}
