import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class to_do_list {
	
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
	
	public static void calender(HashMap<String, ArrayList<String>> listMap, int year, int month) {		
		System.out.println(" " + year + "년 " + month + "월의 달력");		

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
				
				// 10이하의 month, num과 listMap에 저장된 month, day와의 자릿수 차이를 해결(ex. 2와 02의 자릿수 차이)
				String monthString = Integer.toString(month);
				String dayString = Integer.toString(num);
				
				if(month < 10) {
					monthString = "0" + Integer.toString(month);
				}
				
				if(num < 10) {
					dayString = "0" + Integer.toString(num);
				}
				
				String date = year + "-" + monthString + "-" + dayString;
				
				if (listMap.containsKey(date)) {
					// if plans exist
					System.out.printf("  %02d.", num);
				} else {
					// if plans not exist
					System.out.printf("  %02d ", num);
				}				
				
				num++;

				if (num > max) {
					// 최대 일 수에 도달하면 break loop
					System.out.println("");
					break loop;
				}
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		HashMap<String, ArrayList<String>> listMap = new HashMap<String, ArrayList<String>>();
			
		String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")); // 오늘 날짜
		String[] toDate = today.split("-"); // 오늘 날짜를 년, 월, 일로 나눔
		calender(listMap, Integer.parseInt(toDate[0]), Integer.parseInt(toDate[1])); // 오늘 날짜가 포함 된 월의 달력 자동 출력
		
		System.out.println("+---------------------------------+");	
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색 및 변경");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말    q. 종료");
		System.out.println("+---------------------------------+");

		while (true) {
			System.out.print("명령 (1.일정 등록  2.일정 검색 및 변경  3.달력 보기  h.도움말  q.종료)\n> ");
			char order = scanner.next().charAt(0); // choose menu
			scanner.nextLine();

			switch (order) {
			case '1':
				System.out.print("[일정 등록] 날짜를 입력하세요.(ex.2020-01-01)\n> ");
				String theDate = scanner.nextLine();

				if (!listMap.containsKey(theDate)) {
					// 기존의 일정이 없다면, 빈 Arraylist를 추가한다.
					ArrayList<String> emptyList = new ArrayList<String>();
					listMap.put(theDate, emptyList);
				}

				System.out.print("[일정 등록] 일정을 입력하세요.\n> ");
				String theList = scanner.nextLine();

				ArrayList<String> existList = listMap.get(theDate);

				existList.add(theList);
				listMap.put(theDate, existList);
				break;

			case '2':
				System.out.print("[일정 검색] 날짜를 입력하세요.(ex.2020-01-01)\n> ");
				String findDate = scanner.nextLine();

				if (listMap.containsKey(findDate)) {
					// 해당 날짜에 일정이 있다면
					ArrayList<String> schedule = listMap.get(findDate);

					System.out.printf("%d개의 일정이 있습니다.\n", schedule.size());

					for (int i = 0; i < schedule.size(); i++) {
						// 존재하는 일정 전체 출력
						System.out.printf("%d.%s\n", i + 1, schedule.get(i));
					}

					while (true) {
						System.out.print("일정을 변경하시겠습니까?(예:1 / 아니오:2)\n> ");
						String change = scanner.nextLine();

						if (change.equals("1")) {
							// 일정 변경한다.
							System.out.println("현재 등록되어 있는 일정입니다.");
							for (int i = 0; i < schedule.size(); i++) {
								// 존재하는 일정 전체 출력
								System.out.printf("%d.%s\n", i + 1, schedule.get(i));
							}

							System.out.print("변경할 일정의 번호를 입력하세요.(숫자만 입력)\n> ");
							int number = scanner.nextInt();
							scanner.nextLine();

							if (number - 1 >= schedule.size()) {
								// index not exists
								System.out.println("잘 못 입력하셨습니다. 존재하는 일정을 선택하세요.");
								continue;
							} else {
								// index exists
								System.out.print("변경 내용을 입력하세요.\n> ");
								String changeList = scanner.nextLine();

								schedule.set(number - 1, changeList);
								System.out.println("정상적으로 일정이 변경되었습니다.");
							}
						} else if (change.equals("2")) {
							// 일정 변경하지 않는다.
							break;
						} else {
							// 1이나 2 외에 엉뚱한 값을 입력하면
							System.out.println("잘 못 입력하셨습니다. 다시 선택해주세요.");
						}
					}

				} else {
					// 해당 날짜에 일정이 없다면
					System.out.println("해당 날짜에 일정이 존재하지 않습니다.");
				}
				break;

			case '3':				
				System.out.print("년도를 입력하세요: ");
				int year = scanner.nextInt();
				System.out.print("월을 입력하세요: ");
				int month = scanner.nextInt();
				System.out.println("");
				calender(listMap, year, month);
				break;

			case 'h':
				System.out.println("");
				System.out.println("<일정 관리 프로그램 도움말>");
				System.out.println("(1. 일정 등록)을 선택하시면 일정을 등록하고 싶은 날짜와 일정 내용을 입력하시면 해당 일정이 저장됩니다.");
				System.out.println("(2. 일정 검색 및 변경)을 선택하시면 검색하고 싶은 날짜를 입력하시면 해당 날짜에 저장 된 일정을 보여줍니다. 일정 변경 또한 가능합니다.");
				System.out.println("(3. 달력 보기)를 선택하시면 원하시는 년도와 월의 달력을 보여줍니다.");
				System.out.println("(h. 도움말)을 선택하시면 지금 보고 계시는 이 도움말을 보여줍니다.");
				System.out.println("(q. 종료)를 선택하시면 일정 관리 프로그램이 종료됩니다.");
				System.out.println("");
				break;

			case 'q':
				System.out.println("종료합니다. 이용해 주셔서 감사합니다.");
				System.exit(0);

			default:
				System.out.println("잘 못 입력하셨습니다. 다시 선택해주세요.");
			}
		}
	}

}
