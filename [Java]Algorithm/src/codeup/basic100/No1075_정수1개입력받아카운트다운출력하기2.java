package codeup.basic100;

import java.util.Scanner;

public class No1075_정수1개입력받아카운트다운출력하기2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		while (number > 0) {
			System.out.println(--number);
		}
	}

}
