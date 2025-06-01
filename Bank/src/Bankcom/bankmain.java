package Bankcom;

public class bankmain {
	public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        bank user1=new bank(1);
        user1.setbalance(600);
        System.out.println(user1.getbalance());
       System.out.print(user1.withdraw(200));
   }  
}
class bank{
    private int id; 
    private int Total;
    private int amount;
    public bank(int id){
        this.id = id;
    }
    private final int minbal=500;
    private int bal;
    
    public int getbalance(){
        return bal;
    }
      public int getminbalance(){
        return minbal;
    }
      public void setbalance(int bal){
        this.bal=bal;
    }
    public int withdraw(int amount){
        try{
            if(amount>minbal){
                
            throw new IllegalArgumentException("minbalance should be maintained");
            }
            else{ Total = bal-amount;  
            return Total;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return bal;
    }
}
