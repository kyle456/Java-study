package codeup.basic100;

import java.util.Scanner;

public class No1077_정수1개입력받아그수까지출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for(int i = 0; i <= number; i++) {
			System.out.println(i);
		}
	}

}
