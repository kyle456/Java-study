// while���� Scanner�� �̿��Ͽ� Ű����κ��� �Էµ� �����ͷ� ����, ���, ��ȸ, ���� ����� �����϶�

package exercise;

import java.util.Scanner;

public class exercise_4_07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("����> ");

			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.print("���ݾ�> ");
				int inMoney = scanner.nextInt();
				balance += inMoney;
				break;
			case 2:
				System.out.print("��ݾ�> ");
				int outMoney = scanner.nextInt();
				balance -= outMoney;
				break;
			case 3:
				System.out.println("�ܰ�> " + balance);
				break;
			case 4:
				run = false;
				break;
			}

			System.out.println();
		}

		System.out.println("���α׷� ����");
	}

}
