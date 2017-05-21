package ie.gmit.sw.Examples;

public class ReverseTwoNums {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int[] result = numSwap(num1, num2);
		
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	public static int[] numSwap(int num1, int num2) {
		int temp = 0;
		int[] result = new int[2];
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		result[0] = num1;
		result[1] = num2;
		
		return result;
	}
}