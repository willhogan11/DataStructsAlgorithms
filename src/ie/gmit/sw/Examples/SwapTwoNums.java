package ie.gmit.sw.Examples;

public class SwapTwoNums {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		System.out.println("Initial State: " + num1 + " : " + num2);
		swappedNums(num1, num2);
	}
	
	
	public static void swappedNums(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Swapped State: " + num1 + " : " + num2);
	}
}