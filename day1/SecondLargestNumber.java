package week3.day1;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int arr[] = { 14, 354, 65, 4, 7575, 922 };
		Arrays.sort(arr);
		// 4, 14, 65, 354, 922, 7575s
		int length = arr.length;
		System.out.println(arr[length - 2]);
	}

}
/* Console Output
922
*/