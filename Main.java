//Name: Dhvani Uday Parekh
//AIML-B3
//21070126126
import java.io.*;
import java.util.Scanner;
public class Main{
 //arrays to store input numbers and result   
	static double[]numbers;
	static double[]result;
	
	public static void main(String args[]){
		//object of two files
		UserInput input=new UserInput();
		Calculator calculator=new Calculator();
		
		//stores input operator 
		char operator=input.insertOperator(); 
		
		//switch case to perform operations based on input operator. In each case we:
		//we take 2 numbers
		//call respective perform method from Caculator class and store in result
		//print the result
		switch(operator){
			case '+':
			numbers=input.insertNumbers();
			result=calculator.performAddition(numbers);
			System.out.print("Sum is: "+result[0]);
			break;
			
			case '-':
			numbers=input.insertNumbers();
			result=calculator.performSubtraction(numbers);
			System.out.print("Subtraction is: "+result[0]);
			break;
			
			case '*':
			numbers=input.insertNumbers();
			result=calculator.performMultiplication(numbers);
			System.out.print("Multiplication is: "+result[0]);
			break;
			
			case '/':
			numbers=input.insertNumbers();
			result=calculator.performDivision(numbers);
			System.out.print("Division is: "+result[0]);
			break;
			
			case'@':
			try{
			numbers=input.insertArray();
			result=calculator.performArrayoperations(numbers);
			System.out.println("Sum of array is:"+result[0]);
			System.out.println("Standard Deviation is:"+result[1]);
			System.out.println("Variance is:"+result[2]);
			}
			catch(IOException e){
				System.out.println("Array Empty");
			}
			break;
		}
	}
}