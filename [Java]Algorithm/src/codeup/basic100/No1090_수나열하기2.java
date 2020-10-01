package codeup.basic100;

import java.util.Scanner;

public class No1090_수나열하기2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String threeNumbers = scanner.nextLine();
		String[] threeNumbersSplit = threeNumbers.split(" ");

		long a = Long.parseLong(threeNumbersSplit[0]); // 시작 값
		long r = Long.parseLong(threeNumbersSplit[1]); // 등비
		long n = Long.parseLong(threeNumbersSplit[2]); // 몇 번째인지

		System.out.println(a * (long) Math.pow(r, n - 1));
	}

}
