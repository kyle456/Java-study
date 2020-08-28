package BaekJoon;

import java.util.Scanner;

public class B200828_평균점수 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;

		for (int i = 0; i < 5; i++) {
			int score = scanner.nextInt();

			if (score < 40) {
				score = 40; // 40미만일 경우 보충학습 & 점수 40점 부여
			}

			total += score;
		}
		
		System.out.printf("%d", total / 5);

	}

}
