package codeup.basic100;

import java.util.Scanner;

public class No1099_성실한개미 {
	static final int ROW = 10; // 미로 상자의 가로
	static final int COLUMN = 10; // 미로 상자의 세로
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] mazeBox = new int[ROW][COLUMN]; // 10 x 10의 미로 상자

		// 미로 상자의 구조와 먹이 위치를 입력
		for (int i = 0; i < ROW; i++) {
			String eachLine = scanner.nextLine();
			String[] eachLineSplit = eachLine.split(" ");

			for (int j = 0; j < COLUMN; j++) {
				if (eachLineSplit[j].equals("1"))
					mazeBox[i][j] = 1; // 벽
				else if (eachLineSplit[j].equals("2"))
					mazeBox[i][j] = 2; // 먹이
			}
		}
		
		// 개미의 현재 위치(초기값은 개미의 출발점)
		int nowRow = 1;
		int nowColumn = 1;
		
		// 개미의 이동
		while (true) {
			if (mazeBox[nowRow][nowColumn] == 2) {
				// 먹이에 도달 했다면 탈출
				mazeBox[nowRow][nowColumn] = 9;
				break;
			} else {
				mazeBox[nowRow][nowColumn] = 9;
			}
			
			if (mazeBox[nowRow][nowColumn + 1] != 1) {
				// 오른쪽으로 갈 수 있다면
				nowColumn++;
			} else if (mazeBox[nowRow + 1][nowColumn] != 1) {
				// 오른쪽으로는 못 가지만, 아래쪽으로 갈 수 있다면
				nowRow++;
			} else {
				// 오른쪽과 아래쪽 둘 다 못가면
				break;
			}
		}
		
		// 최종 결과 출력
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.print(mazeBox[i][j] + " ");
			}
			
			System.out.println();
		}

	}

}
