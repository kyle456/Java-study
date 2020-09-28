package codeup.basic100;

import java.util.Scanner;

public class No1036_영문자1개입력받아10진수로출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char character = scanner.next().charAt(0);
		System.out.println((int) character);

	}

}
