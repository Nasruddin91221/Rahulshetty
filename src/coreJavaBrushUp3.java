
public class coreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// /String is an object/ stringLiteral:

		String s1 = "Rahul Shetty Academy";
		String s2 = "Rahul Shetty Academy";

		String s3 = new String("Congratulations");
		String s4 = new String("Sorry");

		String[] splittedString = s1.split("Shetty");

		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim()); // trim method is used for To Remove the Empty Space

		for (int i = s1.length() - 1; i >= 0; i--) { // Write a program in a Reverse Format until =0
			System.out.println(s1.charAt(i)); // Char method is used for To Split by Character by character
		}

	}

}
