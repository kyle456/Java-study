// Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷��� �ۼ��϶�.

package exercise;

import java.util.Scanner;

public class exercise_5_09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {				
				for (int i = 0; i < scores.length; ++i) {
					System.out.printf("scores[%d]: ", i);
					scores[i] = scanner.nextInt();
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; ++i) {
					System.out.printf("scores[%d]: %d\n", i, scores[i]);
				}
			} else if (selectNo == 4) {
				int sum = 0;
				int max = 0;

				for (int i = 0; i < scores.length; ++i) {
					max = (max < scores[i]) ? scores[i] : max;

					sum += scores[i];
				}

				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + ((double) sum / studentNum));

			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("���α׷� ����");

	}

}
