package codeup.basic100;

import java.util.Scanner;

public class No1080_언제까지더해야할까 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		int number = scanner.nextInt();
		
		while (true) {
			sum += i;
			
			if (sum >= number) {
				System.out.println(i);
				break;
			}
			
			i++;
			
		}
	}

}
