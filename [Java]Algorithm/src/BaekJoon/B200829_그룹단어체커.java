package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B200829_�׷�ܾ�üĿ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // �Է� �ܾ� ����
		int count = 0; // �׷� �ܾ� ����(��� ���)
		
		for (int i = 0; i < num; i++) {
			String word = br.readLine(); // �Է� �ܾ�
			String[] alphabet = word.split("");
			int index = 0;
			boolean group = true;
			
			loop:
			while (index < alphabet.length - 1) {
				if(alphabet[index].equals(alphabet[index + 1])) {
					index++;
					continue;
				} else {
					for (int j = index + 2; j < alphabet.length; j++) {
						if (alphabet[index].equals(alphabet[j])) {
							group = false;
							break loop;
						}							
					}					
					index++;
				}
			}
			
			if(group) count++;						
		}
		
		System.out.println(count);
		
	}

}
