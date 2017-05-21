package ie.gmit.sw.Examples;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortArraytest {

	public static void main(String[] args) {
		
		
		String[] strArr = {"will", "jake", "fred", "mike", "noel"};
		Integer[] numArr = {5,2,7,9,10,12,1};
		
		System.out.println("SORTED STRING ARRAY:");
		System.out.println(sortedStrArray(strArr));
		
		System.out.println();
		
		System.out.println("SORTED NUMBER ARRAY:");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public static int[] sortedNumArray(int[] numArr) {
		int temp = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 1; j < numArr.length - i; j++) {
				if(numArr[j-1] > numArr[j]) {
					temp = numArr[j-1];
					numArr[j-1] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		return numArr;
	}
	
	
	public static SortedSet<String> sortedStrArray(String[] strArr) {
		SortedSet<String> set = new TreeSet<String>();
		for (String string : strArr) {
			set.add(string);
		}
		return set;
	}
	
}