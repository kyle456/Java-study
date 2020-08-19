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
			System.out.print("명령 (1, 2, 3, h, q)\n> ");
			char order = scanner.next().charAt(0); // choose menu
			scanner.nextLine();

			switch (order) {
			case '1':
				System.out.print("[일정 등록] 날짜를 입력하세요.\n> ");
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
				System.out.print("찾기 > ");
				String c = scanner.nextLine();

				System.out.println(listMap.get(c));

				break;
				
			case '3':

				break;
				
			case 'h':
				System.out.println("<일정 관리 프로그램 도움말>");
				System.out.println("(1. 일정 등록)을 선택하시면 일정을 등록하고 싶은 날짜와 일정 내용을 입력하시면 해당 일정이 저장됩니다.");
				System.out.println("(2. 일정 검색 및 변경)을 선택하시면 검색하고 싶은 날짜를 입력하시면 해당 날짜에 저장 된 일정을 보여줍니다. 일정 변경 또한 가능합니다.");
				System.out.println("(3. 달력 보기)를 선택하시면 오늘 날짜를 자동으로 인식하여 해당 월의 달력을 보여줍니다.");
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
