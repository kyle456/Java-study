package codeup.basic100;

import java.util.Scanner;

public class No1098_설탕과자뽑기 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int h = scanner.nextInt(); // 격자판 세로
		int w = scanner.nextInt(); // 격자판 가로
		int[][] checkerBoard = new int[h][w]; // 격자판 생성
		
		int n = scanner.nextInt(); // 막대 개수
		
		for (int i = 0; i < n; i++) {
			int l = scanner.nextInt(); // 막대 길이
			int d = scanner.nextInt(); // 막대 방향(0:가로, 1:세로)
			int x = scanner.nextInt() - 1; // 행 좌표
			int y = scanner.nextInt() - 1; // 열 좌표
			
			if (d == 0) {
				// 막대를 가로로 놓음
				for (int j = 0; j < l; j++) {
					checkerBoard[x][y++] = 1;
				}
				
			} else {
				// 막대를 세로로 놓음
				for (int j = 0; j < l; j++) {
					checkerBoard[x++][y] = 1;
				}
			}
			
		}
		
		// 막대가 놓인 격자판 출력
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(checkerBoard[i][j] + " ");
			}
			
			System.out.println();
		}

	}

}
