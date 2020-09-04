// while문과 Scanner를 이용하여 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 구현하라

package exercise;

import java.util.Scanner;

public class exercise_4_07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");

			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.print("예금액> ");
				int inMoney = scanner.nextInt();
				balance += inMoney;
				break;
			case 2:
				System.out.print("출금액> ");
				int outMoney = scanner.nextInt();
				balance -= outMoney;
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				run = false;
				break;
			}

			System.out.println();
		}

		System.out.println("프로그램 종료");
	}

}
