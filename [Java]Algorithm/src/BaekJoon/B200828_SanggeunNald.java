package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B200828_SanggeunNald {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] burger = new int[3];
		int[] drink = new int[2];
		
		
		for(int i = 0; i < 3; i++) {
			burger[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < 2; i++) {
			drink[i] = Integer.parseInt(br.readLine());
		}
		
		int cheapest = burger[0] + drink[0];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				if(cheapest > burger[i] + drink[j]) {
					cheapest = burger[i] + drink[j];
				}
			}
		}
		
		System.out.print(cheapest - 50);
		br.close();

	}

}
