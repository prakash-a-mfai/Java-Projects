package Restaurant;

public class customer extends Thread {
	private Restaurant restaurant;
   private String customer;
   private String orderedfood;
   
   public customer(String orders,String name) {
	   this.restaurant=new Restaurant();
	   this.customer=name;
	   this.orderedfood=orders;
   }
   
   public void run() {
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			restaurant.orderfood(orderedfood,customer);
	
	   }
   }
   

