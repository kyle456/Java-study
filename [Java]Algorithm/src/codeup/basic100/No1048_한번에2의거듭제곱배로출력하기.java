package codeup.basic100;

import java.util.Scanner;

public class No1048_한번에2의거듭제곱배로출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String twoNumbers = scanner.nextLine();
		String[] twoNumbersSplit = twoNumbers.split(" ");
		
	    long first = Long.parseLong(twoNumbersSplit[0]);
		long second = Long.parseLong(twoNumbersSplit[1]);
		
		//2의 a승 = (2 << a) / 2
		System.out.println(first * ((2 << second) / 2));
	}

}
