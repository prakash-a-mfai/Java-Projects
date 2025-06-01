package task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MessagePrinter implements Runnable{
       private int i;
	MessagePrinter(int i){
	this.i=i;
	}
	public void run() {
		System.out.println("Task "+ i +" " +Thread.currentThread().getName());
	}
}
public class task2 {
	public static void main(String[] args) {
		
  ExecutorService executor=Executors.newFixedThreadPool(3);
//  ExecutorService executor1=Executors.newCachedThreadPool();
 
  for(int i=1;i<=5;i++) {
	  executor.submit(new MessagePrinter(i));
  }
  executor.shutdown();
}
}

