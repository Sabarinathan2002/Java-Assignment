package week6.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		List<String> values = new ArrayList<String>();
		values.add("HCL");
		values.add("Wipro");
		values.add("Aspire Systems");
		values.add("CTS");
		Collections.sort(values);
		Collections.reverse(values);
		System.out.println(values);

	}

}
