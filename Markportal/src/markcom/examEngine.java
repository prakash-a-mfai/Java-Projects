package markcom;
import exceptionss.*;
import java.util.*;
public class examEngine {
    private markobj[] questions;
    private int score=0;
    private int skip=0;
    private int invalidstreak=0;
    
    public examEngine() {
    	questions =new markobj[5];
    	loadquestions();
    }
    public void loadquestions() {
    	questions[0]=new markobj("What is the capital of india?",new String[] {"mumbai","delhi","cehnnai","kolkata"},'B');
    	questions[1]=new markobj("who developed java?",new String[] {"dennis richie","james gosling","bjarne Stroustrup","Gudio van roussum"},'B');
    	questions[2]=new markobj("which planet is known as red planet?",new String[] {"earth","Mars","jupiter","venus"},'B');
    	questions[3]=new markobj("what is the largest ocean?",new String[] {"Atlantic","Indian","pacific","Arctic"},'C');
    	questions[4]=new markobj("which datatype is used to create a varibale that should store text?",new String[] {"int","String","float","char"},'B');

    }
    public void startexam() {
    	Scanner sc = new Scanner(System.in);
    	for(int i=0;i<questions.length;i++) {
    		markobj q=questions[i];
    		System.out.println("\n Q"+( i+1) +";");
    		q.display();
    		
    		boolean isvalid=false;
    		while(!isvalid) {
    			System.out.println("enter the option A/B/C/D or S to skip");
    			String input = sc.nextLine().trim().toUpperCase();
    			
    			try {
    				if(input.isEmpty()|| (!input.matches("[A-D]|S"))){
    					invalidstreak++;
    					throw new invalidAnswerexception("invalid input please choose any of give only");
    				}
    				
    				if (invalidstreak>=3) {
    					throw new cheatingDetectedException("Cheating is detected");
    				}
    				if(input.equals("S")) {
    					skip++;
    					if(skip>2) {
    						throw new skipLimitExceedexception("skip limit exceeded");
    					}
    				System.out.println("question is skipped");
    				isvalid=true;
    			   }
    				else{
    					invalidstreak=0;
    				}
    				if(q.iscorrect(input.charAt(0))) {
    					System.out.println("correct answer");
    					score++;
    				}
    				else {
    					System.out.println("wrong answer");
    				}
    				isvalid=true;
    			}
    		catch(cheatingDetectedException| invalidAnswerexception|skipLimitExceedexception e) {
    			System.out.println("[" +e.getClass().getSimpleName() +"]" +e.getMessage());
    			if(e instanceof cheatingDetectedException) {
    				System.out.println("disqualified");
    				return;
    			}
    			
    			}
    	}
    	}
    	System.out.println("\n final score:"+score+ "/" + 5);
    	System.out.println("thanks for completing the exam");
   
    }
    }


