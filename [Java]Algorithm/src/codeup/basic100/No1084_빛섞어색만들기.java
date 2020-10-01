package codeup.basic100;

import java.util.Scanner;

public class No1084_빛섞어색만들기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String threeNumbers = scanner.nextLine();
		String[] threeNumbersSplit = threeNumbers.split(" ");
		
		int red = Integer.parseInt(threeNumbersSplit[0]);
		int green = Integer.parseInt(threeNumbersSplit[1]);
		int blue = Integer.parseInt(threeNumbersSplit[2]);
		
		int count = 0;
		
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < green; j++) {
				for(int k = 0; k < blue; k++) {
					System.out.println(i + " " + j + " " + k);
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
