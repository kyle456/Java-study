package codeup.basic100;

import java.util.Scanner;

public class No1039_정수2개입력받아합출력하기2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String twoNumbers = scanner.nextLine();
		String[] twoNumbersSplit = twoNumbers.split(" ");
		
		long first = Long.parseLong(twoNumbersSplit[0]);
		long second = Long.parseLong(twoNumbersSplit[1]);
		
		System.out.println(first + second);

	}

}
