package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B200828_star21 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < num; k++) {
					if(j == 0) {
						//ù ��° ���� ��� -> ¦���� ° index���� ��ǥ
						if(k % 2 == 0) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					} else {
						//�� ��° ���� ��� -> Ȧ���� ° index���� ��ǥ
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
