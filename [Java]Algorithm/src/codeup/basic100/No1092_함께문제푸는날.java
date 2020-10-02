package codeup.basic100;

import java.util.Scanner;

public class No1092_함께문제푸는날 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String threeNumbers = scanner.nextLine();
		String[] threeNumbersSplit = threeNumbers.split(" ");

		int one = Integer.parseInt(threeNumbersSplit[0]); //첫 번째 사람의 주기
		int two = Integer.parseInt(threeNumbersSplit[1]); //두 번째 사람의 주기
		int three = Integer.parseInt(threeNumbersSplit[2]); //세 번째 사람의 주기
		
		int day = 1; //함께 문제를 푸는 날(1부터 시작)
		
		while (day % one != 0 || day % two != 0 || day % three != 0) {
			day++;
		}
		
		System.out.println(day);
	}

}
