import java.util.Scanner;

public class to_do_list {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색 ");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말    q. 종료");
		System.out.println("+----------------------+");

		while (true) {
			System.out.print("명령 (1, 2, 3, h, q)\n>");
			char order = scanner.next().charAt(0);
			
			switch(order) {
	        case '1': 
	            
	            break;
	        case '2':
	            
	            break;
	        case '3':
	            
	            break;
	        case 'h':
	            
	            break;
	        case 'q':
	        	System.out.println("종료합니다. 이용해 주셔서 감사합니다.");
	            System.exit(0);
	        default :
	            System.out.println("잘 못 입력하셨습니다. 다시 선택해주세요.");
			}
		}
	}

}
