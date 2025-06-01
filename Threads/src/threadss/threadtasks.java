package threadss;
 class hellothread extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
			System.out.println("Hello "+Thread.currentThread().getName());
			Thread.sleep(1000);
			}
			}
			catch(InterruptedException e) {
                e.printStackTrace();
			}	
	}
}
 class welcomethread extends Thread{
		public void run() {
			try {
		    for(int i=0;i<5;i++) {
			System.out.println("welcome "+Thread.currentThread().getName());
			Thread.sleep(1000);
			}
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
 class Goodmorningthread extends Thread{
		public void run() {
			try {
				for(int i=0;i<5;i++) {
				System.out.println("GoodMorning "+Thread.currentThread().getName());
				Thread.sleep(1000);
				}
			}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
		}
	}	
public class threadtasks {
	public static void main(String[] args) {
//	Thread t1=new Thread();
//	t1.start();
	hellothread t2=new hellothread();	
	welcomethread t3=new welcomethread();
	Goodmorningthread t4=new Goodmorningthread();

	t2.start();
//	try {t2.join();} catch(InterruptedException e) {e.printStackTrace();};

//	System.out.println("hello"+t2.currentThread().getState());

	t3.start();

	try {t3.join();} catch(InterruptedException e) {e.printStackTrace();};
//
//	System.out.println("welcome"+t3.currentThread().getState());

////
//	t4.start();	
//	try {t4.join();} catch(InterruptedException e) {e.printStackTrace();};
	 }		
}

