package week2.day2;

public class SwappingNumberWithTemp {

	public static void main(String[] args) {

		int a = 17;
		int b = 16;
		System.out.println("Before Swapping a value is "+a);
		System.out.println("Before Swapping b value is "+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping a value is "+a);
		System.out.println("After Swapping b value is "+b);
		

	}

}
/*Console Output
Before Swapping a value is 17
Before Swapping b value is 16
After Swapping a value is 16
After Swapping b value is 17
*/