package codeup.basic100;

import java.util.Scanner;

public class No1093_이상한출석번호부르기1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt(); // 출석 번호를 부른 횟수
		scanner.nextLine();
		
		String numbers = scanner.nextLine(); // 무작위로 부른 n개의 번호
		String[] numbersSplit = numbers.split(" ");
		
		int[] studentNum = new int[23]; // 23명의 학생의 번호
		
		for (int i = 0; i < n; i++) {
			studentNum[Integer.parseInt(numbersSplit[i]) - 1]++;
		}
		
		for (int i = 0; i < studentNum.length; i++) {
			System.out.print(studentNum[i] + " ");
		}
	}

}
