import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class to_do_list {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		HashMap<String, ArrayList<String>> listMap = new HashMap<String, ArrayList<String>>();

		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색 및 변경");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말    q. 종료");
		System.out.println("+----------------------+");

		while (true) {
			System.out.print("명령 (1.일정 등록  2.일정 검색 및 변경  3.달력 보기  h.도움말  q.종료)\n> ");
			char order = scanner.next().charAt(0); // choose menu
			scanner.nextLine();

			switch (order) {
			case '1':
				System.out.print("[일정 등록] 날짜를 입력하세요.(ex.2020-01-01)\n> ");
				String theDate = scanner.nextLine();

				if (!listMap.containsKey(theDate)) {
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
					ArrayList<String> schedule = listMap.get(findDate);

					System.out.printf("%d개의 일정이 있습니다.\n", schedule.size());

					for (int i = 0; i < schedule.size(); i++) {
						System.out.printf("%d.%s\n", i + 1, schedule.get(i));
					}

					while (true) {
						System.out.print("일정을 변경하시겠습니까?(예:1 / 아니오:2)\n> ");
						String change = scanner.nextLine();

						if (change.equals("1")) {
							System.out.println("현재 등록되어 있는 일정입니다.");
							for (int i = 0; i < schedule.size(); i++) {
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
							break;
						} else {
							System.out.println("잘 못 입력하셨습니다. 다시 선택해주세요.");
						}
					}

				} else {
					System.out.println("해당 날짜에 일정이 존재하지 않습니다.");
				}
				break;

			case '3':

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
