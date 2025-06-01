package Restaurant;

public class foodItems {
   private int id;
   private String foodname;
   private int price;
   
   public foodItems(int id,String name,int price) {
	   this.id=id;
	   this.foodname=name;
	   this.price=price;
   }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return foodname;
}
public void setName(String name) {
	this.foodname = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
   
   
   
}
