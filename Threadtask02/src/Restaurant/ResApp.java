package Restaurant;

public class ResApp {
public static void main(String[] args) {

	customer c1=new customer("idly","customer1");
	customer c2=new customer("dosa","customer2");
	customer c3=new customer("dosa","customer3");
	customer c4=new customer("pongal","customer4");

    c1.start();
    try {
		c1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	c2.start();
	try {
		c2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	c3.start();
	try {
		c3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	c4.start();
}
}
