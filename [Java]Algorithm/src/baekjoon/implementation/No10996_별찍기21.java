package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10996_별찍기21 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < num; k++) {
					if(j == 0) {
						if(k % 2 == 0) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					} else {
						if(k % 2 == 0) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
				}
				System.out.println();
			}
		}
		br.close();
	}

}
