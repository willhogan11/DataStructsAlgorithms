package ie.gmit.sw.Examples;

public class SumOfNumsInAarray {

	public static void main(String[] args) {
		int[] arr = {2,4,7,4,9,10,12};
		System.out.println(sumOfArray(arr));
	}
	
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}