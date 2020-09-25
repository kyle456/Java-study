package codeup.basic100;

import java.util.Scanner;

public class No1029_실수1개입력받아출력하기2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double number = scanner.nextDouble();
		System.out.printf("%.11f\n", number);

	}

}
