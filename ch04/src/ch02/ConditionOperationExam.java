package ch02;

public class ConditionOperationExam {

	public static void main(String[] args) {
		
		int score = 95;
		//char ���� ����
		char grade;
		//���ǹ� if �� else ����
		if(score > 90) {
			grade = 'A';
		}else {
			grade = 'B';
		}

		System.out.println("���:"+grade); //String + char => String + String => "���:"+'A' => "���:"+"A" => "���:A"
		
		
		score = 80;
		grade = score>90 ? 'A' : 'B';
		System.out.println("���:"+grade);
	}

}
