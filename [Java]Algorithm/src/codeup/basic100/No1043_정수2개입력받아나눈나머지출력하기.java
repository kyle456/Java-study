package codeup.basic100;

import java.util.Scanner;

public class No1043_정수2개입력받아나눈나머지출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String twoNumbers = scanner.nextLine();
		String[] twoNumbersSplit = twoNumbers.split(" ");
		
		int first = Integer.parseInt(twoNumbersSplit[0]);
		int second = Integer.parseInt(twoNumbersSplit[1]);

		System.out.println(first % second);
	}

}
