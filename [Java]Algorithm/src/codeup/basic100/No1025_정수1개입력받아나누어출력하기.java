package codeup.basic100;

import java.util.Scanner;

public class No1025_정수1개입력받아나누어출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int tenThousand = 10000;
		
		for(int i = 0; i < 5; ++i) {
			int answer = (number / tenThousand) * tenThousand;
			System.out.println("[" + answer + "]");
			number -= answer;
			tenThousand /= 10;
		}
	}

}
