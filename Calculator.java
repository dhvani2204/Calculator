import java.lang.Math.*;//for math operations
import java.util.*;
public class Calculator{
	public double[] performAddition(double[]numbers){
		double[] result=new double[2];
		result[0]=numbers[0]+numbers[1];//adding 2 elements of number array
		
		return result;
	}
	public double[] performSubtraction(double[]numbers){
		double[] result=new double[2];
		result[0]=numbers[0]-numbers[1];//Subtracting 2 elements of number array
		
		return result;
	}
		public double[] performMultiplication(double[]numbers){
		double[] result=new double[2];
		result[0]=numbers[0]*numbers[1];//multiplying 2 elements of number array
		
		return result;
	}
		public double[] performDivision(double[]numbers){
		double[] result=new double[2];
		result[0]=numbers[0]/numbers[1];//Dividing 2 elements of number array
		
		return result;
	}
	
	public double[]performArrayoperations(double[]numbers){
		double[]result=new double[4];
		double sum=0;
		double std=0.0;
		double summ=0.0;
		
		for(int i=0;i<numbers.length;i++){
		    //adding all elements of number array
			sum+=numbers[i];
		}
		result[0]=sum;
		// Calculating standard deviation 
		double mean=sum/numbers.length;
		for(int i=0;i<numbers.length;i++){
			summ=summ+Math.pow((numbers[i]-mean),2);
			std=Math.sqrt(summ/numbers.length);
		}
		result[1]=std;
		//Calculating variance
		double variance=Math.pow(std,2);
		result[2]=variance;
		return result;
	}
}