package CalculatorPrograms;

import java.util.Scanner;

public class addition {
	
	public static int add(int a, int b,int c) 
	{
		int result = a+b+c;
		return result;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number");
		 int num1 = sc.nextInt();
		 System.out.println("Enter the second Number");
		 int num2 = sc.nextInt();
		 System.out.println("Enter the third Number");
		 int num3 = sc.nextInt();
		 int sum = add(num1,num2,num3);
		 
		 System.out.println("The addition of two inputs is" +sum);
	      sc.close(); 
	}

}
