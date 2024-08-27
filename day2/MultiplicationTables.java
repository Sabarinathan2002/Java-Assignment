package week2.day2;

public class MultiplicationTables {

	public static void main(String[] args) {
		int num=7;
		for(int i=1;i<=10;i++) {
			int temp=num * i;
			System.out.println(num+" * "+i+" = "+temp);
		}

	}

}
/*Console output
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
7 * 10 = 70
*/