package ie.gmit.sw.Examples;

public class SortNumArray {

	public static void main(String[] args) {
		
		int temp = 0;
		int[] anArray = {12, 5, 8, 10};
		
		for (int i = 0; i < anArray.length; i++) {
			for (int j = 1; j < anArray.length - i; j++) {
				if(anArray[j-1] > anArray[j]) {
					temp = anArray[j-1];
					anArray[j-1] = anArray[j];
					anArray[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array: ");
		for (int i : anArray) {
			System.out.println(i);
		}
	}
}