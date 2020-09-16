package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B200828_상근날드{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] burger = new int[3];
		int[] drink = new int[2];

		for (int i = 0; i < 3; i++) {
			burger[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < 2; i++) {
			drink[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(burger);
		Arrays.sort(drink);

		System.out.print(burger[0] + drink[0] - 50);
		br.close();

	}

}
