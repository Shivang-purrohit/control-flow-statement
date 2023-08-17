package com.assignmentone;

import java.util.Scanner;
/*Write a program to print the tables -  10 values (12 x 1 = 12)*/
public class Table {
	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter your Number ");
		int number=userInput.nextInt();
		int multi=0;
		
		for(int i=1;i<=10;i++) {
			multi=number*i;
			System.out.println(number+" X "+i+" = "+multi);
		}
		userInput.close();
	}
}