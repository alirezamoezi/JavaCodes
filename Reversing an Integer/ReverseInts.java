import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;


public class ReverseInt {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number that you want to reverse!");
		int inputNumber = input.nextInt(); 
		System.out.println(ReversingAnInt(inputNumber));
	}
	
	public static int ReversingAnInt(int number) {
		int length = String.valueOf(number).length();
		int[] arrayOfDigits = new int[length];
		for (int i = 0; i < length; i++) {
			int Remainder = number % (int) Math.pow(10, i+1);
			arrayOfDigits[i] = Remainder / (int) Math.pow(10, i);
		}
		String reversedString = Arrays.stream(arrayOfDigits).mapToObj(String::valueOf).collect(Collectors.joining(""));
		int reversedNumber = Integer.parseInt(reversedString);
		return reversedNumber;
	}
	
}
