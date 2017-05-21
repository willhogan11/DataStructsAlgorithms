package ie.gmit.sw.Examples;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		// Verbose Approach
		/*System.out.print("Normal String : " + str + "\n\n");
		System.out.print("Reversed String: ");
		System.out.println(reverse(str));*/
		
		
		// A Better Approach
		System.out.println(str.length());
		System.out.println(improvedReverse(str));
		
	}

	public static char[] reverse(String str){
		char temp;
		char[] strToChar = str.toCharArray();
		int left = 0;
		int right = strToChar.length - 1;
		
		for (left = 0; left < right; left++, right--) {
			temp = strToChar[left];
			strToChar[left] = strToChar[right];
			strToChar[right] = temp;
		}
		return strToChar;
	}
	
	// A much less verbose Approach would be:
	public static String improvedReverse(String str){
		int length = str.length();
		String reverse = "";
		for (int i = length -1; i >= 0 ; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
}