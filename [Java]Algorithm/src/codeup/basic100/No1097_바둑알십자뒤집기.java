package codeup.basic100;

import java.util.Scanner;

public class No1097_바둑알십자뒤집기 {
	static final int WIDTH = 19; // 바둑판의 가로
	static final int HEIGHT = 19; // 바둑판의 세로

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] checkerBoard = new int[WIDTH][HEIGHT]; // 19 x 19 바둑판

		// 최초 바둑돌의 위치
		for (int i = 0; i < WIDTH; i++) {
			String eachLine = scanner.nextLine();
			String[] eachLineSplit = eachLine.split(" ");

			for (int j = 0; j < HEIGHT; j++) {
				if (eachLineSplit[j].equals("1")) {
					checkerBoard[i][j] = 1;
				}
			}
		}

		int n = scanner.nextInt(); // 입력받는 좌표의 개수
		scanner.nextLine();
		
		// 십자 뒤집기
		for (int i = 0; i < n; i++) {
			String location = scanner.nextLine();
			String[] locationSplit = location.split(" "); // 십자 뒤집기 할 좌표 입력
			
			int row = Integer.parseInt(locationSplit[0]);
			int column = Integer.parseInt(locationSplit[1]);
			
			// 열 뒤집기
			for (int j = 0; j < WIDTH; j++) {
				if (checkerBoard[j][column - 1] == 0)
					checkerBoard[j][column - 1] = 1;
				else
					checkerBoard[j][column - 1] = 0;
			}
			
			// 행 뒤집기
			for (int j = 0; j < HEIGHT; j++) {
				if (checkerBoard[row - 1][j] == 0)
					checkerBoard[row - 1][j] = 1;
				else
					checkerBoard[row - 1][j] = 0;
			}
		}
		
		// 십자 뒤집기 한 바둑판 출력
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < HEIGHT; j++) {
				System.out.print(checkerBoard[i][j] + " ");
			}
			
			System.out.println();
		}

	}

}
