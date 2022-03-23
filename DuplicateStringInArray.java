package practice;

public class DuplicateStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = { "apple", "mango", "mango", "orange" };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					System.out.println(array[i]);
				}
			}
		}
	}

}
