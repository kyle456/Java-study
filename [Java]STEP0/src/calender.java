// ��¥ Ķ�������� ������ �޷°� �Ȱ��� �����.

import java.util.Scanner;

public class calender {
	
	public static int monthDay(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				return 29;
			}
			else {
				return 28;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ���: ");
		int year = scanner.nextInt();
		System.out.print("���� �Է��ϼ���: ");
		int month = scanner.nextInt();
		System.out.println("");

		System.out.println(year + "�� " + month + "���� �޷�");
		System.out.println("");

		int sum = 0;

		for (int i = 1583; i < year; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				// �����̶��
				sum += 2;
			} else {
				// ����̶��
				sum += 1;
			}
		}

		int first = (sum + 6) % 7; // �Է��� year�� 1�� 1���� ����

		for (int j = 1; j < month; j++) {
			first += monthDay(year, j) % 7;
		}
		
		int day = first % 7; // �Է��� month�� 1���� ����
		int num = 1; // month�� �� ǥ��
		int max = monthDay(year, month); // �ش� month�� ������ �ִ� �� ��
		boolean start = false;
		
		System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
		
		loop:
		for (int row = 0; row <= 5; row++) {
			for (int column = 0; column <= 6; column++) {
				if(row == 0 && !start) {
					// �޷��� ù ��
					if(column == day) {
						// ���� �Ͽ� �����ϸ�
						start = true;
					}
					else {
						// ���� �Ͽ� ���� ������ ����
						System.out.print("     ");
						continue;
					}
				}
				
				System.out.printf("  %02d ", num);
				num++;
				
				if(num > max) {
					// �ִ� �� ���� �����ϸ� break loop
					break loop;
				}
			}
			System.out.println("");
		}
		
	}

}