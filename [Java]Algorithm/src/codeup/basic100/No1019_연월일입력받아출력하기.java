package codeup.basic100;

import java.util.Scanner;

public class No1019_연월일입력받아출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String dateNum = scanner.nextLine();
		String[] componentOfDate = dateNum.split("\\.");
		int year = Integer.parseInt(componentOfDate[0]);
		int month = Integer.parseInt(componentOfDate[1]);
		int day = Integer.parseInt(componentOfDate[2]);
		
		System.out.printf("%04d.%02d.%02d", year, month, day);

	}

}
