package codeup.basic100;

import java.util.Scanner;

public class No1067_정수1개입력받아분석하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		if (number < 0)
			System.out.println("minus");
		else
			System.out.println("plus");
		
		if (number % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}

}
