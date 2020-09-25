package codeup.basic100;

import java.util.Scanner;

public class No1026_시분초입력받아분만출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String clockTime = scanner.nextLine();
		String[] clockTimeSplit = clockTime.split(":");
		
		System.out.println(Integer.parseInt(clockTimeSplit[1]));
	}

}
