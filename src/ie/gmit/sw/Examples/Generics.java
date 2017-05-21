package ie.gmit.sw.Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		
		Integer[] numArray = {1,2,3,4,5,6,7,8,9,10};
		String[] strArray = {"Apple", "Orange", "Banana"};
		Double[] doubleArray = {14.2, 12.4, 5.6, 4.7};
		Character[] charArray = {'A' ,'B', 'C', 'D'};
		
		System.out.println("Normal Arrays....");
		printArray(numArray);
		System.out.println();
		
		printArray(strArray);
		System.out.println();
		
		printArray(doubleArray);
		System.out.println();
		
		printArray(charArray);
		System.out.println("\n\n\nGeneric Lists....");
		
		
		// Now Test the Generic List array print method
		List<String> listStrings = new ArrayList<String>(Arrays.asList("New York", "Chicago", "Denver"));
		List<Integer> listNums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		printList(listStrings);
		System.out.println();
		
		printList(listNums);
	}
	
	
	// Generic Method Declaration for basic Arrays
	public static <T> void printArray(T[] input){
		for (T element : input) {
			System.out.print(element + " ");
		}
	}
	
	public static <T> void printList(List<T> input){
		for (T element : input) {
			System.out.print(element + " ");
		}
	}
}