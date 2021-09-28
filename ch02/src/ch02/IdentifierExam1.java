package ch02;

public class IdentifierExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		// String @myName = "홍길동" - 오류 : @로 시작하면 안됨
		// int #no = 27; - 오류 : # 사용 안됨
		// int !age = 30; - 오류 : ! 사용 안됨
		
		String _name = "일지매"; // 정상 _변수명  - 참조타입(String)
		int $money = 1000; // 정상 $변수명		 - 기본타입(int)
		
		// int 1stJob = 1; - 오류 : 숫자로 시작 안됨
		int job1st = 1; // 정상
		
		// int my count = 10; - 오류 : my와 count 사이에 띄어쓰기 안됨
		// int your		turn = 2; - 오류 : your와 turn 사이에 tab만큼의 공백이 있으면 안됨
		
		// 길이에 제한 없음
		// 변수명은 소문자로 시작
		// 단어와 단어가 합쳐진 합성어인 경우 합쳐지는 뒤 단어의 첫글자는 대문자로 나머지는 소문자로 표시 - 관례
		// -> 카멜 표기법이라고 함
		String myCountryNameAndMycityNameAndMydongis = "대한민국서울강남";
		
		
		// 변수 선언
		// 타입 변수명(식별자) = 값 ;
		// int true = "참"; - true/false는 식별자로 사용 불가
		// boolean false = "거짓";
		
		// String null = "아무것도 없다"; - null도 식별자로 사용 불가
		
		// 변수(식별자)는 대소문자를 구분함. Test와 test는 전혀 다른 변수임.
		int Test = 10;
		int test = 20;
		
		//예약어
		// int for = 10; // (컴퓨터) 1100110 1101111 1110010, (십진수 변환 값) 102 111 114
		// 사용가능
		int FOR = 20; //아스키 문자표 FOR = (컴퓨터)1000110 1001111 1010010, (십진수변환 값)70  79  82
		
	}

}
