package codeup.basic100;

import java.util.Scanner;

public class No1091_수나열하기3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String fourNumbers = scanner.nextLine();
		String[] fourNumbersSplit = fourNumbers.split(" ");

		long a = Long.parseLong(fourNumbersSplit[0]); // 시작 값
		long m = Long.parseLong(fourNumbersSplit[1]); // 곱할 값
		long d = Long.parseLong(fourNumbersSplit[2]); // 더할 값
		long n = Long.parseLong(fourNumbersSplit[3]); // 몇 번째인지
		
		long mSum = 0; // m의 거듭제곱 합

		if (n == 1) {
			// 첫 번째 수 반환
			System.out.println(a);
		} else {
			for (int i = 0; i <= n - 2; i++) {
				// 1부터 m의 n-2승까지 차례대로 더함
				mSum += (long) Math.pow(m, i);
			}
			
			// (a * m의 n-1승) + (d * 1부터 m의 n-2승까지 차례대로 더한 수) = 찾는 답
			System.out.println((a * (long) Math.pow(m, n - 1)) + (d * mSum));
		} 
	}

}
