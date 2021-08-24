package com.bridgelabz.functionalprograms;
import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a,b,c");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double delta=b*b-4*a*c;
		
		if(delta>=0) {
			double root1=(-b+Math.sqrt(delta))/2*a;
			double root2=(-b+Math.sqrt(delta))/2*a;
			System.out.printf("Roots are %.2f and %.2f",root1,root2);
		}
		else
		{
			double real=-b/(2*a);
			double imaginary=Math.sqrt(-delta) / (2 * a);
			System.out.printf("Root are %.2f + %.2fi",real,imaginary);
			System.out.println();
			System.out.printf("Root are %.2f + %.2fi",real,imaginary);
			
		}
		sc.close();
		
	}

}
