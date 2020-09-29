package codeup.basic100;

import java.util.Scanner;

public class No1073_0입력될때까지무한출력하기2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int number = scanner.nextInt();
			
			if(number != 0) {
				System.out.println(number);
			} else {
				break;
			}
		}
	}

}
