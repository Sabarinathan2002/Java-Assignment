package week6.day2;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "babu";
		char ch[] = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j] && i != j) {
					count = 1;
					break;
				}
			}
			if (count == 0) {
				System.out.print(ch[i] + " ");
			}
		}
	}

}
