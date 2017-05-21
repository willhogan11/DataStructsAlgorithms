package ie.gmit.sw.Examples;


public class IsPresent {

	public static void main(String[] args) {
		
		int[] arrayOne = {1,2,3,4,5,6,7,8,9,10};
		
		int result = TargetPresent(arrayOne, 10);
		System.out.println("Target " + result + " found");
		
		boolean resultBool = IsInArray(arrayOne, 10);
		System.out.println("Target present? " + resultBool);
	}
	
	
	public static int TargetPresent(int[] arrayOne, int target){
		for (int i = 0; i < arrayOne.length; i++) {
			if( arrayOne[i] == target) {
				return arrayOne[i];
			}
		}
		return -1;
	}
	
	public static boolean IsInArray(int[] arrayOne, int target){
		for (int i = 0; i < arrayOne.length; i++) {
			if( arrayOne[i] == target) {
				return true;
			}
		}
		return false;
	}
}