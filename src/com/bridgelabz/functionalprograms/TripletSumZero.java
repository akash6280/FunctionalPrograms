package com.bridgelabz.functionalprograms;
import java.util.Scanner;
public class TripletSumZero {
	public static void main(String[] args) {
		
		int sizeOfArray;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array");
		sizeOfArray=sc.nextInt();
		int array[]=new int[sizeOfArray];
		
		System.out.println("Enter array elements");
		for(int index=0;index<sizeOfArray;index++)
			array[index]=sc.nextInt();
		
		int numberOfTriplets=0;
		
		for (int number1=0; number1<sizeOfArray-2; number1++)
	    {
	        for (int number2=number1+1; number2<sizeOfArray-1; number2++)
	        {
	            for (int number3=number2+1; number3<sizeOfArray; number3++)
	            {
	                if (array[number1]+array[number2]+array[number3] == 0)
	                {
	                    System.out.println(array[number1]+" "+array[number2]+" "+array[number3]);
	                	numberOfTriplets++;
	                }
	            }
	        }
	    }
		System.out.println("Number of triplets "+ numberOfTriplets);
		sc.close();
	}
		

}
