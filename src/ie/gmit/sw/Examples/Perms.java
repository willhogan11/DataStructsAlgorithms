package ie.gmit.sw.Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Perms {

	public static void main(String[] args) {
		
		FactorialExample factorialExample = new FactorialExample();
		
		List<Integer> numList = new ArrayList<Integer>();
		int permsLength = factorialExample.fact(numList.size());
		List<ArrayList<Integer>> allPermsList = new ArrayList<ArrayList<Integer>>(permsLength);
		
		System.out.println(permsLength);

		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		
		
		for (int i = 0; i < permsLength; i++) {
			Collections.shuffle(numList);
			allPermsList.add((ArrayList<Integer>) numList);
			System.out.println(numList);
			
			if(allPermsList.contains(numList.get(i))){
				allPermsList.remove(numList.indexOf(i));
			}
		}
	}
}