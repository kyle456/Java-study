// ����ڰ� �Է��� ���� ���� ũ�Ⱑ �ٸ� �������� ����� ����Ѵ�.
// ���� ��� ����ڰ� "8,7"�� ���� ���ڿ��� �Է��ϸ� ��ĥ���� �����Ѵ�. ��ĥ���� 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 ���� �����ϴ� ���� �ǹ��Ѵ�.

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		System.out.print("�� ���� �Է��ϼ���(ex. 8,9 - ��ǥ �ʼ�): ");

		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");

		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);

		for (int i = 2; i <= first; i++) {
			System.out.println(i + "��");
			
			for (int j = 1; j <= second; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			
			System.out.println("");
		}

	}

}
