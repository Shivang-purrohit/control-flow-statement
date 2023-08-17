package com.assignmentone;

import java.util.Scanner;



public class ScannerClass {

	int evenSum(int a, int b) { 
		  int c = a+b; 
		  //System.out.println("anwser:"+ c);
		return c;
	}
		 
	
	public static void main(String[] args) {
		
Scanner myScan = new Scanner(System.in);
System.out.println("Enter Number 1:");


int Input= myScan.nextInt();
System.out.println("no. is: " + Input); 
System.out.println("Enter Number 2:");
int Input1= myScan.nextInt();
System.out.println("no is: " + Input1); 

ScannerClass sum = new ScannerClass();
 int result = sum.evenSum(Input, Input1);

System.out.println("Sum: "+result);


  


	}
	
	

}

