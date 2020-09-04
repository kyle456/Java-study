// 중첩 for문을 이용하여 방정식 4x+5y=60 의 모든 해를 구하여 (x,y)의 형태로 출력하라.
// 단 x와 y는 10 이하의 자연수

package exercise;

public class exercise_4_05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; ++i) {
			for (int j = 1; j <= 10; ++j) {
				if ((i * 4) + (j * 5) == 60) {
					System.out.printf("(%d, %d)\n", i, j);
					break;
				}
			}
		}

	}

}
