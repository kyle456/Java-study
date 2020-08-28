package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B200828_º°Âï±â09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int second = num * 2 - 1;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < second; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
			second--;
		}

		second += 2;

		for (int i = num - 2; i >= 0; i--) {
			for (int j = 0; j < second; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			if (i == 0) {
				System.out.println();
			} else {
				System.out.println(" ");
			}
			second++;
		}

		br.close();
	}

}
