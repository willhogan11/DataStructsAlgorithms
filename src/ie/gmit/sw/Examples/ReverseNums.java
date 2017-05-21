package ie.gmit.sw.Examples;

/*
Java reverse an int value - Principles
1. Modding (%) the input int by 10 will extract off the rightmost digit. example: (1234 % 10) = 4
2. Multiplying an integer by 10 will "push it left" exposing a zero to the right of that number, example: (5 * 10) = 50
3. Dividing an integer by 10 will remove the rightmost digit. (75 / 10) = 7

Java reverse an int value - Pseudocode:

a. Extract off the rightmost digit of your input number. (1234 % 10) = 4

b. Take that digit (4) and add it into a new reversedNum.

c. Multiply reversedNum by 10 (4 * 10) = 40, this exposes a zero to the right of your (4).

d. Divide the input by 10, (removing the rightmost digit). (1234 / 10) = 123

e. Repeat at step a with 123
*/
	
// Above courtesy of Eric Leschinski on Stackoverflow:
// http://stackoverflow.com/questions/3806126/java-reverse-int-value

public class ReverseNums {

	public static void main(String[] args) {
		int num = 1357;
		System.out.println("Normal Number: " + num);
		
		System.out.println("Reversed Normal Number: " + reverseNum(num));
		
	}
	
	public static int reverseNum(int num){
		int reversedNum = 0;
		while(num != 0){
			reversedNum = reversedNum * 10 + num % 10;
			num = num / 10;
		}
		return reversedNum;
	}
}
