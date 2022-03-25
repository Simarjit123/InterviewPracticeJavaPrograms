package practice;

public class StringSubstring {
//check if string is substring of another one
	public static void main(String[] args) {
		// create a string
		String s1 = "my name is";
		String s2 = "is ";
		String s3 = "simarjit";

		boolean result = s1.contains(s2);
		if (result) {
			System.out.println(s2 + " is present in the string.");
		} else {
			System.out.println(s2 + " is not present in the string.");
		}

		result = s1.contains(s3);
		if (result) {
			System.out.println(s3 + " is present in the string.");
		} else {
			System.out.println(s3 + " is not present in the string.");
		}
	}
}
