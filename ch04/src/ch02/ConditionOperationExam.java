package ch02;

public class ConditionOperationExam {

	public static void main(String[] args) {
		
		int score = 95;
		//char 변수 선언
		char grade;
		//조건문 if 참 else 거짓
		if(score > 90) {
			grade = 'A';
		}else {
			grade = 'B';
		}

		System.out.println("등급:"+grade); //String + char => String + String => "등급:"+'A' => "등급:"+"A" => "등급:A"
		
		
		score = 80;
		grade = score>90 ? 'A' : 'B';
		System.out.println("등급:"+grade);
	}

}
