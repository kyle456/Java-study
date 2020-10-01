package codeup.basic100;

import java.util.Scanner;

public class No1089_수나열하기1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String threeNumbers = scanner.nextLine();
		String[] threeNumbersSplit = threeNumbers.split(" ");
		
		int a = Integer.parseInt(threeNumbersSplit[0]); // 시작 값
		int d = Integer.parseInt(threeNumbersSplit[1]); // 등차
		int n = Integer.parseInt(threeNumbersSplit[2]); // 몇 번째인지
		
		System.out.println(a + (d * (n - 1)));
	}

}
