package com.aravind;
import java.util.Scanner;
public class Calculator {
	
	 int add(int a ,int b)
	 {
		 return a + b;
	 }
	 
	 int sub(int a ,int b)
	 {
		 return a - b;
	 }
	 
	 int mul(int a ,int b)
	 {
		 return a * b;
	 }
	
	 public static void main(String[] args) {
		 
		Scanner sc=new Scanner (System.in);
		 Calculator obj=new Calculator();
		 System.out.println("Enter the value of a :");
		 int a=sc.nextInt();
		 
		 System.out.println("Enter the value of b :");
		 int b=sc.nextInt();
		 
		 obj.add(a,b);
		 obj.mul(a,b);
		 obj.sub(a,b);
		
	}

}
