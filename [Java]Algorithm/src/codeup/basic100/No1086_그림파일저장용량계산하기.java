package codeup.basic100;

import java.util.Scanner;

public class No1086_그림파일저장용량계산하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String threeNumbers = scanner.nextLine();
		String[] threeNumbersSplit = threeNumbers.split(" ");
		
		int w = Integer.parseInt(threeNumbersSplit[0]); // width
		int h = Integer.parseInt(threeNumbersSplit[1]); // height
		int b = Integer.parseInt(threeNumbersSplit[2]); // bit
		
		int capacity = w * h * b;
		double megaCapacity = (((double) capacity / 8) / 1024) / 1024;
		
		System.out.println(String.format("%.02f", megaCapacity) + " MB");	
	}

}
