package ch04;

public class LiteralCharVsStringExam {

	public static void main(String[] args) {
		
		// 문자타입 변수는 문자 하나를 저장하는 변수
		// ' ' 사이에 공백이 없으면 오류 발생
		//char c1 = '';'
		char c1 = ' '; //리터럴 선언 시 공백 있음.
		
		
		// 문자열 타입변수는 " " 사이에 공백이 없어도 정상.
		String s1 = "";
		
		// 오류 \다음 문자는 특수용도의 문자로 변환
		//System.out.println("\"); -> \혼자 사용할 수 없음.
		
		// \+u는 유니코드라는 의미를 표시하는 기능으로 사용됨.
		System.out.println("\2u"); //숫자2 제외하고 볼 것
		System.out.println("u");

	}

}
