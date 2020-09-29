package codeup.basic100;

import java.util.Scanner;

public class No1076_문자1개입력받아알파벳출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char outputAlphabet = 'a';
		char lastAlphabet = scanner.next().charAt(0);
		
		do {
			System.out.println(outputAlphabet++);
		} while(outputAlphabet <= lastAlphabet);
	}

}
