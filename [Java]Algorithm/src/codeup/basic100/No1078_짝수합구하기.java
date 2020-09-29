package codeup.basic100;

import java.util.Scanner;

public class No1078_짝수합구하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int evenSum = 0;
		
		for(int i = 0; i <= number; i++) {
			if (i % 2 == 0)
				evenSum += i;
		}
		
		System.out.println(evenSum);
	}

}
