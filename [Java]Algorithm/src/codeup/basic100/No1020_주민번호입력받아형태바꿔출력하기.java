package codeup.basic100;

import java.util.Scanner;

public class No1020_주민번호입력받아형태바꿔출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String ssn = scanner.nextLine();
		String[] ssnSplit = ssn.split("-");

		System.out.println(ssnSplit[0] + ssnSplit[1]);

	}

}
