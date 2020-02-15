package com.vinay.github;

public class Calculator {

	int a,b;
	int c;
		
	int add() {
		a=20;
		b=30;
		c=a+b;
		return c;		
	}
	
	int sub() {
		a=50;
		b=10;
		c=a-b;
		return c;
	}
	
	int mul() {
		a=20;
		b=40;
		c=a*b;
		return c;
		//comment
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Calculator calc = new Calculator();
			calc.add();
			System.out.println(calc.add());
			System.out.println(calc.sub());
			System.out.println(calc.mul());
	}

}
