package codeup.basic100;

import java.util.Scanner;

public class No1027_년월일입력받아형식바꿔출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String date = scanner.nextLine();
		String[] dateSplit = date.split("\\.");
		
		int year = Integer.parseInt(dateSplit[0]);
		int month = Integer.parseInt(dateSplit[1]);
		int day = Integer.parseInt(dateSplit[2]);
		
		System.out.printf("%02d-%02d-%04d\n", day, month, year);

	}

}
