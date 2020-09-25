package codeup.basic100;

import java.util.Scanner;

public class No1034_8진정수1개10진수로출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String octalNum = scanner.nextLine();
		System.out.println(Integer.parseInt(octalNum, 8));

	}

}
