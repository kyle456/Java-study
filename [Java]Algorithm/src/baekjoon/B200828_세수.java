package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B200828_세수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String[] b = a.split(" ");
		int[] number = new int[3];

		for (int i = 0; i < 3; i++) {
			number[i] = Integer.parseInt(b[i]);
		}

		Arrays.sort(number);
		System.out.print(number[1]);

	}

}
