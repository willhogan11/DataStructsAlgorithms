package ie.gmit.sw.Examples;

public class FactorialExample {
	
	public int fact(int num){
		int fact = 1;
        for (int i = 1; i <= 6; i++) {
            fact *= i;
        }
        return fact;
	}
}