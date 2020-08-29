// % 연산을 수행한 결과값에 10을 더하는 코드이다.
// NaN 값을 검사하여 올바른 결과가 출력될 수 있도록 NaN을 검사하는 코드를 작성

package exercise;

public class exercise_2_08 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;

		double z = x % y;

		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}

	}

}
