package codeup.basic100;

import java.util.Scanner;

public class No1012_실수1개입력받아출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float number = scanner.nextFloat();
		System.out.printf("%.6f\n", number);

	}

}
