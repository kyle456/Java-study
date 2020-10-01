package codeup.basic100;

import java.util.Scanner;

public class No1085_소리파일저장용량계산하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String fourNumbers = scanner.nextLine();
		String[] fourNumbersSplit = fourNumbers.split(" ");
		
		long h = Long.parseLong(fourNumbersSplit[0]); // Hertz
		long b = Long.parseLong(fourNumbersSplit[1]); // Bit
		long c = Long.parseLong(fourNumbersSplit[2]); // Channel
		long s = Long.parseLong(fourNumbersSplit[3]); // Second
		
		long capacity = h * b * c * s;
		double megaCapacity = (((double) capacity / 8) / 1024) / 1024;
		
		System.out.println(String.format("%.01f", megaCapacity) + " MB");	
	}

}
