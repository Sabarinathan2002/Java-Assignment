package week2.day2;

public class SwappingNumberWithoutTemp {

	public static void main(String[] args) {

		int a = 37;
		int b = 23;
		System.out.println("Before Swapping a value is " + a);
		System.out.println("Before Swapping b value is " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping a value is " + a);
		System.out.println("After Swapping b value is " + b);

	}

}
/*
Before Swapping a value is 37
Before Swapping b value is 23
After Swapping a value is 23
After Swapping b value is 37
*/