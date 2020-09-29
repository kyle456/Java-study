package codeup.basic100;

import java.util.Scanner;

public class No1079_원하는문자가입력될때까지반복출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char q = 'q';
		
		while (true) {
			char character = scanner.next().charAt(0);
			System.out.println(character);
			
			if (character == q)
				break;
		}
	}

}
