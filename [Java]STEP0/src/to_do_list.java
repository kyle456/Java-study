import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class to_do_list {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		HashMap<String, ArrayList<String>> listMap = new HashMap<String, ArrayList<String>>();

		System.out.println("+----------------------+");
		System.out.println("| 1. ���� ���");
		System.out.println("| 2. ���� �˻� �� ����");
		System.out.println("| 3. �޷� ����");
		System.out.println("| h. ����    q. ����");
		System.out.println("+----------------------+");

		while (true) {
			System.out.print("��� (1.���� ���  2.���� �˻� �� ����  3.�޷� ����  h.����  q.����)\n> ");
			char order = scanner.next().charAt(0); // choose menu
			scanner.nextLine();

			switch (order) {
			case '1':
				System.out.print("[���� ���] ��¥�� �Է��ϼ���.(ex.2020-01-01)\n> ");
				String theDate = scanner.nextLine();

				if (!listMap.containsKey(theDate)) {
					ArrayList<String> emptyList = new ArrayList<String>();
					listMap.put(theDate, emptyList);
				}

				System.out.print("[���� ���] ������ �Է��ϼ���.\n> ");
				String theList = scanner.nextLine();

				ArrayList<String> existList = listMap.get(theDate);

				existList.add(theList);
				listMap.put(theDate, existList);
				break;

			case '2':
				System.out.print("[���� �˻�] ��¥�� �Է��ϼ���.(ex.2020-01-01)\n> ");
				String findDate = scanner.nextLine();

				if (listMap.containsKey(findDate)) {
					ArrayList<String> schedule = listMap.get(findDate);

					System.out.printf("%d���� ������ �ֽ��ϴ�.\n", schedule.size());

					for (int i = 0; i < schedule.size(); i++) {
						System.out.printf("%d.%s\n", i + 1, schedule.get(i));
					}

					while (true) {
						System.out.print("������ �����Ͻðڽ��ϱ�?(��:1 / �ƴϿ�:2)\n> ");
						String change = scanner.nextLine();

						if (change.equals("1")) {
							System.out.println("���� ��ϵǾ� �ִ� �����Դϴ�.");
							for (int i = 0; i < schedule.size(); i++) {
								System.out.printf("%d.%s\n", i + 1, schedule.get(i));
							}

							System.out.print("������ ������ ��ȣ�� �Է��ϼ���.(���ڸ� �Է�)\n> ");
							int number = scanner.nextInt();
							scanner.nextLine();

							if (number - 1 >= schedule.size()) {
								// index not exists
								System.out.println("�� �� �Է��ϼ̽��ϴ�. �����ϴ� ������ �����ϼ���.");
								continue;
							} else {
								// index exists
								System.out.print("���� ������ �Է��ϼ���.\n> ");
								String changeList = scanner.nextLine();

								schedule.set(number - 1, changeList);
								System.out.println("���������� ������ ����Ǿ����ϴ�.");
							}
						} else if (change.equals("2")) {
							break;
						} else {
							System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ� �������ּ���.");
						}
					}

				} else {
					System.out.println("�ش� ��¥�� ������ �������� �ʽ��ϴ�.");
				}
				break;

			case '3':

				break;

			case 'h':
				System.out.println("");
				System.out.println("<���� ���� ���α׷� ����>");
				System.out.println("(1. ���� ���)�� �����Ͻø� ������ ����ϰ� ���� ��¥�� ���� ������ �Է��Ͻø� �ش� ������ ����˴ϴ�.");
				System.out.println("(2. ���� �˻� �� ����)�� �����Ͻø� �˻��ϰ� ���� ��¥�� �Է��Ͻø� �ش� ��¥�� ���� �� ������ �����ݴϴ�. ���� ���� ���� �����մϴ�.");
				System.out.println("(3. �޷� ����)�� �����Ͻø� ���Ͻô� �⵵�� ���� �޷��� �����ݴϴ�.");
				System.out.println("(h. ����)�� �����Ͻø� ���� ���� ��ô� �� ������ �����ݴϴ�.");
				System.out.println("(q. ����)�� �����Ͻø� ���� ���� ���α׷��� ����˴ϴ�.");
				System.out.println("");
				break;

			case 'q':
				System.out.println("�����մϴ�. �̿��� �ּż� �����մϴ�.");
				System.exit(0);

			default:
				System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ� �������ּ���.");
			}
		}
	}

}
