package com.bridgelabz.functionalprograms;
import java.util.Scanner;
import java.io.PrintWriter;  
public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		int row,column;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");   
		row = sc.nextInt();   
		System.out.println("Enter the number of columns: ");    
		column= sc.nextInt();   
		
		System.out.println("Enter your choice:\n 1) Integer 2) Double 3) Boolean");
		int choice = sc.nextInt();
		PrintWriter writer = new PrintWriter(System.out);
		
		switch(choice) {
		case 1:
				int integerArray[][] = new int[row][column];    
				System.out.println("Enter the elements of the array: ");  
				for (int indexRow = 0; indexRow < row; indexRow++)   
				for (int indexColumn = 0; indexColumn< column; indexColumn++)   
				integerArray[indexRow][indexColumn] = sc.nextInt();   
				
				for (int indexRow = 0; indexRow < row; indexRow++) {
					for (int indexColumn = 0; indexColumn< column; indexColumn++) {
						writer.print(integerArray[indexRow][indexColumn]+" ");   
					}
					writer.println();
				}
				break;
				
		case 2:
				double doubleArray[][] = new double[row][column];    
				System.out.println("Enter the elements of the array: ");  
				for (int indexRow = 0; indexRow < row; indexRow++)   
				for (int indexColumn = 0; indexColumn< column; indexColumn++)   
				doubleArray[indexRow][indexColumn] = sc.nextDouble();   
				
				for (int indexRow = 0; indexRow < row; indexRow++) {
					for (int indexColumn = 0; indexColumn< column; indexColumn++) {
						writer.print(doubleArray[indexRow][indexColumn]+" ");   
					}
					writer.println();
				}
				break;
				
		case 3:
				boolean booleanArray[][] = new boolean[row][column];    
				System.out.println("Enter the elements of the array: ");  
				for (int indexRow = 0; indexRow < row; indexRow++)   
				for (int indexColumn = 0; indexColumn< column; indexColumn++)   
				booleanArray[indexRow][indexColumn] = sc.nextBoolean();   
				
				for (int indexRow = 0; indexRow < row; indexRow++) {
					for (int indexColumn = 0; indexColumn< column; indexColumn++) {
						writer.print(booleanArray[indexRow][indexColumn]+" ");   
					}
					writer.println();
				}
				break;
		default:
				writer.println("Wrong option");
				break;
		}
		writer.flush();
		sc.close();
					
	}
}
