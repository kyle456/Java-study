// 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �� �� �л��� �� ���� ���� �� �ְ�, ���������� �� ���� �������� ���Ѵ�.

package exercise;

public class exercise_2_04 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//�л� �� ���� ������ ���� ��
		int pencilsPerStudent = ( pencils / students ); 
		System.out.println(pencilsPerStudent);
		
		//���� ���� ��
		int pencilsLeft = ( pencils % students );
		System.out.println(pencilsLeft);

	}

}
