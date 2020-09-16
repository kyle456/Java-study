package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B200830_Fly_me_to_the_Alpha_Centauri {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		long[] answer = new long[num];

		for (int i = 0; i < num; i++) {
			String[] movingPoint = br.readLine().split(" ");
			long start = Long.parseLong(movingPoint[0]);
			long finish = Long.parseLong(movingPoint[1]);
			long range = finish - start;
			long turn = 1;
			long lastNum = 1;

			while (true) {
				if(range <= lastNum) {
					answer[i] = turn;
					break;
				} else {
					turn++;
					long huddle = (turn + 1) / 2;
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


