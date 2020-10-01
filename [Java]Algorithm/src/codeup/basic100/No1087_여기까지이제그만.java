package codeup.basic100;

import java.util.Scanner;

public class No1087_여기까지이제그만 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int i = 1;
		int sum = 0;
		
		while (true) {
			if (sum >= number) {
				System.out.println(sum);
				break;
			} else {
				sum += i;
				i++;
			}
		}
	}

}
