package codeup.basic100;

import java.util.Scanner;

public class No1041_문자1개입력받아다음문자출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char word = scanner.next().charAt(0);
		System.out.println(++word);

	}

}
