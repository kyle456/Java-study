package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B200830_Fly_me_to_the_Alpha_Centauri {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		long[] answer = new long[num]; // 결과 값을 담을 배열

		for (int i = 0; i < num; i++) {
			String[] movingPoint = br.readLine().split(" ");
			long start = Long.parseLong(movingPoint[0]);
			long finish = Long.parseLong(movingPoint[1]);
			long range = finish - start; // 범위
			long turn = 1; // 턴
			long lastNum = 1; // 규칙 중 가장 마지막 수

			while (true) {
				if(range <= lastNum) {
					answer[i] = turn;
					break;
				} else {
					turn++;
					long huddle = (turn + 1) / 2; // lastNum을 다음으로 넘기기 위한 장치
					lastNum += huddle;
				}
			}

		}

		for (int i = 0; i < num; i++) {
			System.out.println(answer[i]);
		}

		br.close();
	}

}


