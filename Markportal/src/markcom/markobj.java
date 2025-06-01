package markcom;
public class markobj {
    private String quest;
    private String[] options;
    private char correctanswer;
    
    public markobj(String quest,String[] options,char correctanswer) {
    	this.quest=quest;
    	this.options=options;
    	this.correctanswer=Character.toUpperCase(correctanswer);
    }
   public void display() {
    	System.out.println(quest);
		 char option='A';
    	 for(String opt : options) {
    		 System.out.println(option+":"+ opt);
    		 option++;
    	 }
    }
   public boolean iscorrect(char answer) {
	   return Character.toUpperCase(answer)== correctanswer;
   }  
}
