import java.util.Scanner;

public class to_do_list {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("+----------------------+");
		System.out.println("| 1. ���� ���");
		System.out.println("| 2. ���� �˻� �� ����");
		System.out.println("| 3. �޷� ����");
		System.out.println("| h. ����    q. ����");
		System.out.println("+----------------------+");

		while (true) {
			System.out.print("��� (1, 2, 3, h, q)\n>");
			char order = scanner.next().charAt(0);
			
			switch(order) {
	        case '1': 
	            
	            break;
	        case '2':
	            
	            break;
	        case '3':
	            
	            break;
	        case 'h':
	            System.out.println("<���� ���� ���α׷� ����>");
	            System.out.println("(1. ���� ���)�� �����Ͻø� ������ ����ϰ� ���� ��¥�� ���� ������ �Է��Ͻø� �ش� ������ ����˴ϴ�.");
	            System.out.println("(2. ���� �˻� �� ����)�� �����Ͻø� �˻��ϰ� ���� ��¥�� �Է��Ͻø� �ش� ��¥�� ���� �� ������ �����ݴϴ�. ���� ���� ���� �����մϴ�.");
	            System.out.println("(3. �޷� ����)�� �����Ͻø� ���� ��¥�� �ڵ����� �ν��Ͽ� �ش� ���� �޷��� �����ݴϴ�.");
	            System.out.println("(h. ����)�� �����Ͻø� ���� ���� ��ô� �� ������ �����ݴϴ�.");
	            System.out.println("(q. ����)�� �����Ͻø� ���� ���� ���α׷��� ����˴ϴ�.");
	            System.out.println("");
	            break;
	        case 'q':
	        	System.out.println("�����մϴ�. �̿��� �ּż� �����մϴ�.");
	            System.exit(0);
	        default :
	            System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ� �������ּ���.");
			}
		}
	}

}
