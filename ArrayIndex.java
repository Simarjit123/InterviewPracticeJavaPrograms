package practice;

public class ArrayIndex {

	public static void main(String[] args) {
//Find Index of element in array
		int array[] = { 11, 22, 33, 44 };
		int number = 44;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				System.out.println("number " + number + " is at index of " + i);
				
			}}
	
	
		
		// find index of String in array
		String list[] =  { "aa", "bb", "cc" };
		String find = "cc";
		for (int j = 0; j < list.length; j++) {
			if (find.equals(list[j])) {
					System.out.println("index of element is : " +j);
			
			}}
			
		
		

	}}


