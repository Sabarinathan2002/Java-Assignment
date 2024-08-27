package week2.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		System.out.print(firstNum + " " + secNum);
		for (int i = 1; i < range; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.print(" " + sum + " ");
		}

	}

}
/*Console Output
0 1 1  2  3  5  8  13  21 
*/