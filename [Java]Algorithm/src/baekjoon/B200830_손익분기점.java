package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B200830_손익분기점 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputData = br.readLine().split(" ");
		int fixedCost = Integer.parseInt(inputData[0]);
		int unfixedCost = Integer.parseInt(inputData[1]);
		int price = Integer.parseInt(inputData[2]);
		
		if (unfixedCost >= price) {
			System.out.println(-1);
			System.exit(0);
		} else {
			System.out.println((fixedCost / (price - unfixedCost)) + 1);
		}
		
	}

}
