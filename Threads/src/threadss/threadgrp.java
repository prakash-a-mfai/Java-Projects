package threadss;

class threadgrpss implements Runnable{
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public	void jump() {
			System.out.println("hello");
		}
	
	}


public class threadgrp {
	public static void main(String[] args) {
ThreadGroup group=new ThreadGroup("Threadgroup");

//hellothread t2=new hellothread();	
welcomethread t3=new welcomethread();
Goodmorningthread t4=new Goodmorningthread();
//Thread one=new Thread(group,t2,"1");
Thread two=new Thread(group,t3,"2");
Thread thre=new Thread(group,t4,"3");
//one.start();
two.start();
thre.start();
group.list();
	}
}
