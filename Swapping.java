package practice;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 50;
		int second = 10;
		System.out.println("first number is:" + first);
		System.out.println("second number is :" + second);

		first = first + second;// 60
		second = first - second;// 50
		first = first - second;// 10
		System.out.println("first number after swapping is:" + first);
		System.out.println("Second number after swapping is: "+ second);
				

	}

}
