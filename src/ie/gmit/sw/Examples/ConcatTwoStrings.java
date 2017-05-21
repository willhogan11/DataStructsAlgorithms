package ie.gmit.sw.Examples;

public class ConcatTwoStrings {

	public static void main(String[] args) {
		String str1 = "Will";
		String str2 = "Hogan";
		
		System.out.println(concatString(str1, str2));
	}
	
	public static String concatString(String str1, String str2){
		return str1 + " " + str2;
	}
}