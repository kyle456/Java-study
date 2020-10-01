package codeup.basic100;

import java.util.Scanner;

public class No1083_369게임의왕이되자 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for (int i = 1; i <= number; i++) {
			if (i == 3 || i == 6 || i == 9) {
				System.out.print("X ");
			} else {
				System.out.print(i + " ");
			}
		}
		
	}

}
