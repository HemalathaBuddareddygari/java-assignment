package Fact.com;

import java.util.Scanner;

public class FactorialOFNumber {
	 public static void main(String args[]){  
		  int fact=1;  
		  Scanner Sc2=new Scanner(System.in);
			 System.out.println("Enter the no ");
			  int number = Sc2.nextInt();
   
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
}

		static int factorial(int n)
		{    
			  if (n == 0)    
			    return 1;    
			  else    
			    return(n * factorial(n-1));    
			 }    
}
