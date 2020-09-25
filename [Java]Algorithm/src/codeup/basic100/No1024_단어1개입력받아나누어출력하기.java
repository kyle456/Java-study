package codeup.basic100;

import java.util.Scanner;

public class No1024_단어1개입력받아나누어출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.nextLine();
		String[] wordSplit = word.split("");

		for(int i = 0; i < wordSplit.length; ++i) {
			System.out.println("\'" + wordSplit[i] + "\'");
		}
	}

}
