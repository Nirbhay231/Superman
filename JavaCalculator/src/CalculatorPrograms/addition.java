package CalculatorPrograms;

import java.util.Scanner;

public class addition {
	
	public static int add(int a, int b) 
	{
		int result = a+b;
		return result;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number");
		 int num1 = sc.nextInt();
		 System.out.println("Enter the second Number");
		 int num2 = sc.nextInt();
		 int sum = add(num1,num2);
		 System.out.println("The addition of two inputs is" +sum);
	      sc.close(); 
	}

}
