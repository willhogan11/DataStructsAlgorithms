package ie.gmit.sw.Examples;

public class IsOddEven {

	public static void main(String[] args) {
		
		System.out.println(oddEven(154));
	}
	
	public static boolean oddEven(int num) {
		if(num % 2 == 0)
			return true;
		return false;
	}
}