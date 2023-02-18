//importing Scanner and I/O packages
import java.util.Scanner;
import java.io.*;

public class UserInput{
        //array to store 2 input numbers for +,-,*,/
	double[]numbers=new double[2];
	
	Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	
	public char insertOperator(){
		//Asking the user for operator
		System.out.println("Enter + for Addition:");
		System.out.println("Enter - for Subtraction:");
		System.out.println("Enter * for Multiplication:");
		System.out.println("Enter / for Division:");
		System.out.println("Enter @ for Array Operation:");
		char operator=sc.next().charAt(0);//storing entered operator
		return operator;
	}
	public double[]insertNumbers(){
	    //Asking user for 2 input numbers and storing them in numbers array.
		System.out.println("Enter First Number:");
		numbers[0]=sc.nextDouble();
		
		System.out.println("Enter Second Number:");
		numbers[1]=sc.nextDouble();
		
		return numbers;
	}
	public double[]insertArray() throws IOException{
	        //Input and store number of array elements
		System.out.println("Enter total numbers to enter:");
		int size_of_array=sc.nextInt();
	        //input array elements
		System.out.println("Enter"+size_of_array+"Numbers:");
		double[] numbers=new double[size_of_array]; //creating an array of size enterd
		
		String array=br.readLine();
		String[]array_numbers=array.trim().split("\\s+");//eliminate spaces
		
		//storing array elements
		for(int i=0;i<size_of_array;i++){
			numbers[i]=Double.parseDouble(array_numbers[i]);
		}
		return numbers;
	}
}