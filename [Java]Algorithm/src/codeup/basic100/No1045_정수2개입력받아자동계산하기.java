package codeup.basic100;

import java.util.Scanner;

public class No1045_정수2개입력받아자동계산하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String twoNumbers = scanner.nextLine();
		String[] twoNumbersSplit = twoNumbers.split(" ");
		
	    long first = Long.parseLong(twoNumbersSplit[0]);
		long second = Long.parseLong(twoNumbersSplit[1]);

		System.out.println(first + second);
		System.out.println(first - second);
		System.out.println(first * second);
		System.out.println(first / second);
		System.out.println(first % second);
		System.out.println(String.format("%.2f", (double) first / (double) second));
	}

}
