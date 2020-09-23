package codeup.basic100;

import java.util.Scanner;

public class No1014_문자2개입력받아순서바꿔출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char a = scanner.next().charAt(0);
		char b = scanner.next().charAt(0);
		
		System.out.printf("%c %c", b, a);

	}

}
