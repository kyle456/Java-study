package codeup.basic100;

import java.util.Scanner;

public class No1088_3의배수는통과 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		for (int i = 1; i <= number; i++) {
			if(i % 3 == 0)
				continue;
			else {
				System.out.print(i + " ");
			}
		}
	}

}
