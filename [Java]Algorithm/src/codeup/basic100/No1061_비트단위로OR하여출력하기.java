package codeup.basic100;

import java.util.Scanner;

public class No1061_비트단위로OR하여출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String twoNumbers = scanner.nextLine();
		String[] twoNumbersSplit = twoNumbers.split(" ");
		
	    int first = Integer.parseInt(twoNumbersSplit[0]);
		int second = Integer.parseInt(twoNumbersSplit[1]);
		
		System.out.println(first & second);
	}

}
