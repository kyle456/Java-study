// 윗면 5, 아랫면 10, 높이 7인 사다리꼴의 넓이 구하기

package exercise;

public class exercise_3_06 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) * height) / 2.0;
		System.out.println(area);
	}

}
