package week6.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String str[] = test.split(" ");
		for (int i = 0; i < str.length; i++) {
			String st = "";
			if (i % 2 != 0) {
				for (int j = str[i].length() - 1; j >= 0; j--) {
					st = st + str[i].charAt(j);
				}
				str[i] = st;
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

	}
}
