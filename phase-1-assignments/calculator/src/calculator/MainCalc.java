package calculator;

import java.util.Scanner; //this is a class to get user input from the java.util package (https://www.w3schools.com/java/java_user_input.asp)

public class MainCalc {

	public static void main(String[] args) {
			
		Scanner enterNum = new Scanner(System.in); //creates object of the class
		 
		System.out.println("Please enter two integers"); //prompts the user for input
		 
		int i1 = enterNum.nextInt(); //allows user to read the first number (https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)
		int i2 = enterNum.nextInt(); //second number
		System.out.println("The integers you entered are: " + i1 + " and " + i2);  //Tells the user what they entered
		
		System.out.println("Please enter one of the following arithmetic operators: +  *  -  / "); //prompts user for input
        char arthOperator = enterNum.next().charAt(0); //read an operator
		
        int result; //create result variable
        
        switch (arthOperator) { //switch statement to calculate the result
        
        case '+':
        	result = i1 + i2;
        	System.out.println(i1 +  " + "  + i2 + " = " + result); //print full result
        	break;
        	
        case '*':
        	result = i1 * i2;
        	System.out.println(i1 +  " * "  + i2 + " = " + result);
        	break;
        	
        case '-':
        	result = i1 - i2;
        	System.out.println(i1 +  " - "  + i2 + " = " + result);
        	break;
        	
        case '/':
        	result = i1 / i2;
        	System.out.println(i1 +  " / "  + i2 + " = " + result);
        	break;

	 	default:
	        System.out.println("You did not enter a valid operator.");
	        return;
	}
        
        //I tried if else first but I didn't realize it would show the else if it matched. Used switch case for final solution. 
		/*
		 * if (arthOperator == '+') { result = (i1 + i2); System.out.println(result); }
		 * if (arthOperator == '*') { result = (i1 * i2); System.out.println(result); }
		 * if (arthOperator == '-') { result = (i1 - i2); System.out.println(result); }
		 * if (arthOperator == '/') { result = (i1 / i2); System.out.println(result); }
		 * else { System.out.println("You did not enter a valid operator. Please enter + or * or - or /"); }
		 */
	}

}
