package com.online.www;

class Regret{
	public void gg() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Wow inside gg");
			} catch (InterruptedException e) {
				// 
				e.printStackTrace();
			}
			
		}
	}
}

public class Threads {

	public static void main(String[] args) throws InterruptedException {
//		Runnable mr=()->{
//			for(int i=0;i<10;i++) {
//				try {
//					Thread.sleep(1000);
//					System.out.println("Wow");
//				} catch (InterruptedException e) {
//					// 
//					e.printStackTrace();
//				}
//			}
			
//		};
		Regret r=new Regret();
		Runnable i=r::gg;
		
		Thread t=new Thread(i);
		t.start();
		for(int ir=0;ir<10;ir++) {
			Thread.sleep(1000);
			System.out.println("Simply Superb in main");
		}
	}

}
