package com.aravind;

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
		 
		 Calculator obj=new Calculator();
		 obj.add(10,20);
		 obj.mul(10,20);
		 obj.sub(10,20);
		
	}

}
