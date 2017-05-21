package ie.gmit.sw.Examples;

public class Palindrome {

	public static void main(String[] args) {
		
		String original = "radar"; 
		System.out.println(Ispalindrome(original));
	}
	
	public static boolean Ispalindrome(String str){
		String reverse = "";
		int length = str.length();
		
		for (int i = length -1; i >= 0; i--)
			reverse = reverse + str.charAt(i);
		
		if(str.equals(reverse)) 
			return true; 
		return false;
		
		// Ternary equivalent
		// return (str.equals(reverse)) ? true : false;
	}
}