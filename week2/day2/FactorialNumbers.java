package week2.day2;

public class FactorialNumbers {

	public static void main(String[] args) {
		int num = 5;
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=i*fact;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
/*
Factorial of 5 is 120
*/