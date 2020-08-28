package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B200828_º°Âï±â13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int i = 1, j = 1;
		
		while (i <= num) {			
			System.out.print("*");
			
			if(j < i) {
				j++;
				continue;
			}
			
			i++;
			j = 1;
			System.out.println();
		}
		
		i -= 2;
		
		while (i > 0) {			
			System.out.print("*");
			
			if(j < i) {
				j++;
				continue;
			}
			
			i--;
			j = 1;
			System.out.println();
		}
		
		br.close();		
	}

}
