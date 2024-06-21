import java.util.ArrayList;
import java.util.Arrays;

public class coreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr3[] = { 2, 3, 4, 5, 13, 25, 30, 33, 37, 55, 60, 85, 90 };

		// print the numbers which are only divisable by 2 by using Loops

		// Check if array has multiple of 2
		for (int i = 0; i < arr3.length; i++) {

			if (arr3[i] % 2 == 0) {
				System.out.println(arr3[i]);
				break;
			} else {
				System.out.println(arr3[i] + "This is not Divisable by 2");
			}

		}

		ArrayList<String> a = new ArrayList<String>();
		// create object of the class =bject.method & String Array
		a.add("Hero");
		a.add("Vilan");
		a.add("Heroin");
		a.add("Comedian");
		System.out.println(a.get(3));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i)); // This is the enhanced for loop type
		}
		;
		System.out.println("*************");
		for (String val : a) {
			System.out.println(val); // This is the enhanced for loop type
		}
		;
		System.out.println("------------");
		// Items Present in the Array List
		System.out.println(a.contains("Mango")); // contains method is used for To search and find in the list

		// Convert the Normal array into ArrayList
		String[] names = { "Nasruddin", "Shahid", "Shabazz", "Nouman" };
		Arrays.asList(names);

	}

}
