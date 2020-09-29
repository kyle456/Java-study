package codeup.basic100;

import java.util.Scanner;

public class No1070_월입력받아계절출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		switch (score) {
		case 1:
		case 2:
		case 12: System.out.println("winter"); break;
		
		case 3:
		case 4:
		case 5: System.out.println("spring"); break;
		
		case 6:
		case 7:
		case 8: System.out.println("summer"); break;
		
		case 9:
		case 10:
		case 11: System.out.println("fall"); break;
		}
	}

}
