package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B200830_���ͺб��� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputData = br.readLine().split(" ");
		int fixedCost = Integer.parseInt(inputData[0]); // �������
		int unfixedCost = Integer.parseInt(inputData[1]); // �������(1�� ��)
		int price = Integer.parseInt(inputData[2]); // ����(1�� ��)
		
		if (unfixedCost >= price) {
			// ��������� ���ݰ� ũ�ų� ������ ���ͺб����� ���� �� ����
			System.out.println(-1);
			System.exit(0);
		} else {
			// ���ͺб��� = (������� / (���� - �������)) + 1
			System.out.println((fixedCost / (price - unfixedCost)) + 1);
		}
		
	}

}
