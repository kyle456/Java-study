package codeup.basic100;

import java.util.Scanner;

public class No1095_이상한출석번호부르기3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt(); // 출석 번호를 부른 횟수
		scanner.nextLine();
		
		String numbers = scanner.nextLine(); // 무작위로 부른 n개의 번호
		String[] numbersSplit = numbers.split(" ");
		
		int min = Integer.parseInt(numbersSplit[0]);
		
		for (int i = 1; i < numbersSplit.length; i++) {
			if (min > Integer.parseInt(numbersSplit[i]))
				min = Integer.parseInt(numbersSplit[i]);
		}
		
		System.out.println(min);
	}

}
