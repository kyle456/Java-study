package codeup.basic100;

import java.util.Scanner;

public class No1057_참거짓이서로같을때에만참출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String twoNumbers = scanner.nextLine();
		String[] twoNumbersSplit = twoNumbers.split(" ");
		
	    int first = Integer.parseInt(twoNumbersSplit[0]);
		int second = Integer.parseInt(twoNumbersSplit[1]);
		
		if ((first == 0 && second == 0) || (first == 1 && second == 1)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
