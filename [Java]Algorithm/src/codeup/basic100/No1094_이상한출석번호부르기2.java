package codeup.basic100;

import java.util.Scanner;

public class No1094_이상한출석번호부르기2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt(); // 출석 번호를 부른 횟수
		scanner.nextLine();
		
		String numbers = scanner.nextLine(); // 무작위로 부른 n개의 번호
		String[] numbersSplit = numbers.split(" ");
		
		for (int i = numbersSplit.length - 1; i >= 0; i--) {
			System.out.print(numbersSplit[i] + " ");
		}
	}

}
