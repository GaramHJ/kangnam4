package ch06;

public class NullLiteralExam {

	public static void main(String[] args) {
		
		// 기본타입에는 null 리터럴을 사용 불가
		//int n = null;
		int n;
		n=10;
		System.out.println(n);
		
		//참조(객체)타입에는 초기화 조건으로 사용
		String str = null;
		System.out.println(str);
		
		
		str = "hello";
		System.out.println(str);
		
		

	}

}
