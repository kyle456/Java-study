package codeup.basic100;

import java.util.Scanner;

public class No1069_평가입력받아다르게출력하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char evaluation = scanner.next().charAt(0);
		
		if (evaluation == 'A')
			System.out.println("best!!!");
		else if (evaluation == 'B')
			System.out.println("good!!");
		else if (evaluation == 'C')
			System.out.println("run!");
		else if (evaluation == 'D')
			System.out.println("slowly~");
		else
			System.out.println("what?");
	}

}
