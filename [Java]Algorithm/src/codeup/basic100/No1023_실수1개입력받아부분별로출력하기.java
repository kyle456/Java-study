package codeup.basic100;

import java.util.Scanner;

public class No1023_실수1개입력받아부분별로출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String number = scanner.nextLine();
		String[] numberSplit = number.split("\\.");

		System.out.println(numberSplit[0]);
		System.out.println(numberSplit[1]);

	}

}
