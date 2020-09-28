package codeup.basic100;

import java.util.Scanner;

public class No1035_16진정수1개입력받아8진수로출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String octalNum = scanner.nextLine();
		System.out.printf("%o\n", Integer.parseInt(octalNum, 16));

	}

}
