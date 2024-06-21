
public class coreJavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 10; // This is an example of Integer declare
		String website = "Rahul Shetty Academy"; // This is an example of String declare
		char letter = 'N'; // This is an example of Character declare
		float num = 123; // This is an example of Floating values declare
		double point = 10.25; // This is an example of decimal values declare
		boolean theif = true; // This is an example of Boolean declare
		System.out.println("This is my Number:" + myNum);
		// Arrays -
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
//		arr[5]=6;

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("The index of 7 is :" + arr2[7]);
		// Loops-
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		;

		// String of Array

		String[] names = { "Nasruddin", "Shahid", "Shabazz", "Nouman" };

		for (int j = 0; j < names.length; j++) {
//			System.out.println(names[j]);

		}
		;
		// Enhanced for Loop Syntax
		for (String s : names) {
			System.out.println(s);
		}

	}

}
