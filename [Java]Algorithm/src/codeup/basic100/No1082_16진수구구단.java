package codeup.basic100;

import java.util.Scanner;

public class No1082_16진수구구단 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputHexa = scanner.next();
		int hexaDecimal = Integer.parseInt(inputHexa, 16);
		
		for (int i = 1; i <= 15; i++) {
			System.out.printf("%s*%X=%X\n", inputHexa, i, hexaDecimal * i);
		}
		
	}

}
