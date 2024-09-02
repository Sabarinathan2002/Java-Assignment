package week3.day1;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = { 7, 5, 4, 2, 1, 3 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 != arr[i]) {
				System.out.println(i + 1);
				break;
			}
		}
	}

}
/* Console output
6
*/