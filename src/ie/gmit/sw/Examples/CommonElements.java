package ie.gmit.sw.Examples;

public class CommonElements {

	public static void main(String[] args) {
		
		int count = 0;
		int[] arr = {1,2,3,4,5,5,4};

		arr = areUnique(arr);
		
		
		System.out.println("Duplicates numbers in the Array");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && arr[i-1] != i){
				count++;
				System.out.println("Number: " + arr[i]);
			}
		}
		
		System.out.println();
		System.out.println("Count of Duplicates in the Array : " + count);
	}

	
	public static int[] areUnique(int[] arr){
		int[] arrayDups = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++){
			for (int j = i + 1; j < arr.length; j++){
				if (arr[i] == arr[j]) {
					arrayDups[i] = arr[i];
				}
			}
		}
		return arrayDups;
	}
}