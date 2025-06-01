package calculator;

import java.util.Scanner;
import java.util.Stack;

public class calculator {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
Stack<Double> operand= new Stack<>();
Stack<Character> operator = new Stack<>();
double result = 0;
boolean running = true;
   while (running) {
	  System.out.println("Enter a number, operator (+, -, *, /), 'undo operand', 'undo operator', '=' to calculate, or 'exit':");
	  String input = scanner.nextLine().trim();
	    switch (input) {
	       case "undo operand":
	          if (!operand.isEmpty()) {
	              double removed = operand.pop();
	              System.out.println("Removed last operand: " + removed);
	                  }
	           else {
	                 System.out.println("No operand to undo.");
	                    }
	                    break;
	       case "undo operator":
	            if (!operator.isEmpty()) {
	                 char removedOp = operator.pop();
	                 System.out.println("Removed last operator: " + removedOp);
	           } 
	           else {
	                 System.out.println("No operator to undo.");
	                    }
	                    break;

	       case "=":
	           if (operand.size() < 2 || operator.isEmpty()) {
	                      System.out.println("Need two operands and one operator to calculate.");
	                      break;
	                 }
	            double b = operand.pop();
	            double a = operand.pop();
	            char op = operator.pop();
	              switch (op) {
	                        case '+': result = a + b; break;
	                        case '-': result = a - b; break;
	                        case '*': result = a * b; break;
	                        case '/':
	                            if (b != 0) result = a / b;
	                            else {
	                                System.out.println("Cannot divide by zero.");
	                                operand.push(a);
	                                operand.push(b);
	                                operator.push(op);
	                                continue;
	                            }
	                            break;
	                        default:
	                            System.out.println("Invalid operator.");
	                            continue;
	                    }
	                    System.out.println("Result: " + result);
	                    operand.push(result);
	                    break;

	                case "exit":
	                    running = false;
	                    break;

	                default:
	                    if (isOperator(input)) {
	                        operator.push(input.charAt(0));
	                    } else {
	                        try {
	                            double num = Double.parseDouble(input);
	                            operand.push(num);
	                        } catch (NumberFormatException e) {
	                            System.out.println("Invalid input. Try again.");
	                        }
	                    }
	             break;
	            }
	        }
	        System.out.println("Calculator closed.");
	        scanner.close();
	    }
private static boolean isOperator(String s) {
	return s.length() == 1 && "+-*/".contains(s);
	 }
}


