package asyncJava;

import java.util.Arrays;

public class Main2 {
public static void main(String[] args) {
		
		
		int[] num = new int[3000];

		for(int i = 0; i<num.length; i++) {
			num[i]= (int)(Math.random()*3000);
		}
		System.out.println(Arrays.toString(num));
		
		Es2_Thread r1= new Es2_Thread(num,0,1000);
		Es2_Thread r2= new Es2_Thread(num,1000,2000);
		Es2_Thread r3= new Es2_Thread(num,2000,3000);
		
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r2);
		Thread t3= new Thread(r3);
		
		t1.start();
		
	

		try {
			t1.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		
	   int sum=0;	
	   for (int i = 0; i <Es2_Thread.partialSum.length; i++) {
		   sum+=Es2_Thread.partialSum[i];
	   }
		System.out.println("La somma di tutti i valori è: "+sum);
		
	}
}
