package binaryReversal;

import java.util.Scanner;

public class BinaryReversal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer in the next line and press enter :");
		String integer = scanner.nextLine();
		System.out.println("You entered : " + integer);
		BinaryReversal binaryReversal = new BinaryReversal();
		binaryReversal.binaryReversal(integer);
	}
	
	public void binaryReversal(String text) {
		int integer = Integer.parseInt(text);
		if(integer > 0) {
			System.out.println("Integer after converted to binary : " + Integer.toBinaryString(integer));
			String PaddedBinaryInteger = String.format("%8s", Integer.toBinaryString(integer)).replaceAll(" ", "0");
			System.out.println("Value after padding with 0 : " + PaddedBinaryInteger);
			String reversePaddedInteger = new StringBuilder(PaddedBinaryInteger).reverse().toString();
			System.out.println("Value of the reverse binary : " + reversePaddedInteger);
	        int decimalValue = Integer.parseInt(reversePaddedInteger,2);
	        System.out.println("Value after converting reverse binary to integer : " +decimalValue);
		}
		else {
	        System.out.println("Number " + integer + " is not positive integer. Please enter a positive integer");
		}
	}
}
