package week6.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (rev.equalsIgnoreCase(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
