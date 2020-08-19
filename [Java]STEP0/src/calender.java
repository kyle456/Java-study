// 진짜 캘린더에서 나오는 달력과 똑같이 만들기.

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
			} else {
				return 28;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("년도를 입력하세요: ");
		int year = scanner.nextInt();
		System.out.print("월을 입력하세요: ");
		int month = scanner.nextInt();
		System.out.println("");

		System.out.println(year + "년 " + month + "월의 달력");
		System.out.println("");

		int sum = 0;

		for (int i = 1583; i < year; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				// 윤년이라면
				sum += 2;
			} else {
				// 평년이라면
				sum += 1;
			}
		}

		int first = (sum + 6) % 7; // 입력한 year의 1월 1일의 요일

		for (int j = 1; j < month; j++) {
			first += monthDay(year, j) % 7;
		}

		int day = first % 7; // 입력한 month의 1일의 요일
		int num = 1; // month의 일 표시
		int max = monthDay(year, month); // 해당 month가 가지는 최대 일 수
		boolean start = false;

		System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");

		loop: for (int row = 0; row <= 5; row++) {
			for (int column = 0; column <= 6; column++) {
				if (row == 0 && !start) {
					// 달력의 첫 행
					if (column == day) {
						// 시작 일에 도달하면
						start = true;
					} else {
						// 시작 일에 도달 전에는 공백
						System.out.print("     ");
						continue;
					}
				}

				System.out.printf("  %02d ", num);
				num++;

				if (num > max) {
					// 최대 일 수에 도달하면 break loop
					break loop;
				}
			}
			System.out.println("");
		}

	}

}
