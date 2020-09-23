package codeup.basic100;

import java.util.Scanner;

public class No1015_실수입력받아둘째자리까지출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float number = scanner.nextFloat();
		System.out.println(String.format("%.2f", number));

	}

}
