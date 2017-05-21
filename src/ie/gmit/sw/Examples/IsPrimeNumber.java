package ie.gmit.sw.Examples;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		//System.out.println(" asdf" +isPrime(5));
		
		System.out.println("asdfasd");
	}
	
	public static boolean isPrime(int num){
		
		for (int i = 1; i < num; i++) {
			if(i % num == 0)
				return true;
		}
		return false;
	}
}