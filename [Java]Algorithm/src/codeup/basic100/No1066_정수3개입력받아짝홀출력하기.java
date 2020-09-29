package codeup.basic100;

import java.util.Scanner;

public class No1066_정수3개입력받아짝홀출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String twoNumbers = scanner.nextLine();
		String[] twoNumbersSplit = twoNumbers.split(" ");
		
	    long first = Long.parseLong(twoNumbersSplit[0]);
		long second = Long.parseLong(twoNumbersSplit[1]);
		long third = Long.parseLong(twoNumbersSplit[2]);
		
		if (first % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		if (second % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		if (third % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}

}
