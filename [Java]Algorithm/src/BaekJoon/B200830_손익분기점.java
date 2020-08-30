package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B200830_손익분기점 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputData = br.readLine().split(" ");
		int fixedCost = Integer.parseInt(inputData[0]); // 고정비용
		int unfixedCost = Integer.parseInt(inputData[1]); // 가변비용(1대 당)
		int price = Integer.parseInt(inputData[2]); // 가격(1대 당)
		
		if (unfixedCost >= price) {
			// 가변비용이 가격과 크거나 같으면 손익분기점을 넘을 수 없음
			System.out.println(-1);
			System.exit(0);
		} else {
			// 손익분기점 = (고정비용 / (가격 - 가변비용)) + 1
			System.out.println((fixedCost / (price - unfixedCost)) + 1);
		}
		
	}

}
