package com.assignmentone;

import java.util.Scanner;
/*find the sum of even digit in a number - scanner  - while loop, Do while loop*/
public class SumOfEven {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter your number");
		int number = userInput.nextInt();
		int sum = 0;
		int tempNum;
		while(number!=0) {
			tempNum=number%10;
			number=number/10;
			if(tempNum%2==0) {
			sum=sum+tempNum;
			}
		}

		System.out.println("The sum is "+sum);
		userInput.close();
	}
}
