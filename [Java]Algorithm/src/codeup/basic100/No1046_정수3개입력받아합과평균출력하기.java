package codeup.basic100;

import java.util.Scanner;

public class No1046_정수3개입력받아합과평균출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String twoNumbers = scanner.nextLine();
		String[] twoNumbersSplit = twoNumbers.split(" ");
		
	    long first = Long.parseLong(twoNumbersSplit[0]);
		long second = Long.parseLong(twoNumbersSplit[1]);
		long third = Long.parseLong(twoNumbersSplit[2]);
		
		System.out.println(first + second + third);
		System.out.println(String.format("%.1f", ((double) first + second + third) / 3.0));
	}

}
