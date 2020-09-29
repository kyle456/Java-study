package codeup.basic100;

import java.util.Scanner;

public class No1064_정수3개입력받아가장작은수출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String twoNumbers = scanner.nextLine();
		String[] twoNumbersSplit = twoNumbers.split(" ");
		
	    long first = Long.parseLong(twoNumbersSplit[0]);
		long second = Long.parseLong(twoNumbersSplit[1]);
		long third = Long.parseLong(twoNumbersSplit[2]);
		
		System.out.println(first > second ? (second > third ? third : second) : (first > third ? third : first));
	}

}
