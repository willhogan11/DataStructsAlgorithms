package ie.gmit.sw.Examples;

public class AddEverySecondNum {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("DISPLAY EVERY SECOND NUMBER IN ARRAY:");
		printEverySecondNum(arr);
		
		System.out.println();
		
		System.out.println("ADD EVERY SECOND NUMBER IN ARRAY:");
		System.out.println(addEveryOtherNum(arr));
	}
	
	public static int addEveryOtherNum(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i += 2) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void printEverySecondNum(int[] arr){
		for (int i = 0; i < arr.length; i += 2)
			System.out.print(arr[i] + ", ");
		System.out.println();
	}
}