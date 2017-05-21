package ie.gmit.sw.Examples;

public class TestBubble {

	public static void main(String[] args) {
		bubble();
		
		System.out.println();
		
		linearExample();
		
		System.out.println();
		
		int n = 13109;
		System.out.println(efficientIsPrime(n));
	}
	
	
	// Example of Linear complexity
	public static void linearExample() {
		int feet = 100;
		int centipides = 1;
		int pairsOfShoes = 0; 
		
		for(int i = 0; i < 10; i++) {
			pairsOfShoes = (feet * centipides) / 2;
			System.out.println(centipides + " centipides need : " + pairsOfShoes + " pairs of shoes");
			centipides++;
		}
	}

	
	
	public static void bubble() {
		int[] unsorted = {4,3,2,1};
		int temp = 0;
		int swaps = 0;
		
		for (int i = 0; i < unsorted.length; i++) {
			for (int j = 1; j <unsorted.length - i; j++) {
				if(unsorted[j-1] > unsorted[j]) {
					temp = unsorted[j-1];
					unsorted[j-1] = unsorted[j];
					unsorted[j] = temp;
					swaps++;
				}
			}
		}
		
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + " ");
		}
		
		System.out.println("Number of Swaps : " + swaps);
	}
	
	
	
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++)
			if(n % i == 0) 
				return false;
		return true;
	}
	
	public static boolean efficientIsPrime(int n){
		for (int i = 2; i < Math.sqrt(n); i++)
			if(n % i == 0) 
				return false;
		return true;
	}
}