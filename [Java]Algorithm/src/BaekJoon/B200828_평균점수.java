package BaekJoon;

import java.util.Scanner;

public class B200828_������� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;

		for (int i = 0; i < 5; i++) {
			int score = scanner.nextInt();

			if (score < 40) {
				score = 40; // 40�̸��� ��� �����н� & ���� 40�� �ο�
			}

			total += score;
		}
		
		System.out.printf("%d", total / 5);

	}

}
