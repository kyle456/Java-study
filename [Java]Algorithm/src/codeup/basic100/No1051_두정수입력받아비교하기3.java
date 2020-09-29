package codeup.basic100;

import java.util.Scanner;

public class No1051_두정수입력받아비교하기3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String twoNumbers = scanner.nextLine();
		String[] twoNumbersSplit = twoNumbers.split(" ");
		
	    long first = Long.parseLong(twoNumbersSplit[0]);
		long second = Long.parseLong(twoNumbersSplit[1]);
		
		if (first <= second) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
