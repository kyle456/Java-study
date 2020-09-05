// 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램을 작성하라.

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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
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

				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + ((double) sum / studentNum));

			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");

	}

}
