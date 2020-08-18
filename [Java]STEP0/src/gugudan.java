// 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
// 예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다. 팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		System.out.print("두 수를 입력하세요(ex. 8,9 - 쉼표 필수): ");

		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");

		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);

		for (int i = 2; i <= first; i++) {
			System.out.println(i + "단");
			
			for (int j = 1; j <= second; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			
			System.out.println("");
		}

	}

}
