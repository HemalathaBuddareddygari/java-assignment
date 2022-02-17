package Fact.com;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{ 
		
		int num;
		int i,fact=1;
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("Enter the no ");
		  num=Sc.nextInt();
		  for(i=1;i<=num;i++) 
		  {
			  fact=fact*i;
			  
		  }
		  System.out.println("factorial of number="+fact);

	}

}
