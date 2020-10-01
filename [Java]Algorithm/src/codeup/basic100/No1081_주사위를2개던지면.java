package codeup.basic100;

import java.util.Scanner;

public class No1081_주사위를2개던지면 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String twoNumbers = scanner.nextLine();
		String[] twoNumbersSplit = twoNumbers.split(" ");
		
	    int m = Integer.parseInt(twoNumbersSplit[0]);
		int n = Integer.parseInt(twoNumbersSplit[1]);
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println(i + " " + j);
			}
		}
		
	}

}
