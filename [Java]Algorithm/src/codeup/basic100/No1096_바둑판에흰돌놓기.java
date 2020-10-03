package codeup.basic100;

import java.util.Scanner;

public class No1096_바둑판에흰돌놓기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] checkerBoard = new int[19][19]; // 19 x 19 바둑판
		int n = scanner.nextInt(); // 흰 돌을 놓은 횟수
		scanner.nextLine();

		for (int i = 0; i < n; i++) {
			String location = scanner.nextLine();
			String[] locationSplit = location.split(" "); // 흰 돌을 놓은 위치
			
			int row = Integer.parseInt(locationSplit[0]);
			int column = Integer.parseInt(locationSplit[1]);
			
			checkerBoard[row - 1][column - 1] = 1;
		}
		
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.print(checkerBoard[i][j] + " ");
			}
			
			System.out.println();
		}

	}

}
