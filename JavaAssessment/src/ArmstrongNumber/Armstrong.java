package ArmstrongNumber;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args)
	{
		int number,temp,output=0,remainder;
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("Enter the no to Check ");
		   number = Sc.nextInt();
		   temp=number;
		   for(int i=0;i<number;i++)
	   //  while(number !=0)//we can use this instead of for
		   {
			   remainder=number%10;
			   output=output+remainder*remainder*remainder;
			   number=number/10;
		   }
		   
		   System.out.println(output);		   
	
	if(temp==output)
	{
		   System.out.println("This given number is Armstrong number");		   

	}
	else
		   System.out.println("the given number is not an Armstrong number");		   

	}
}
