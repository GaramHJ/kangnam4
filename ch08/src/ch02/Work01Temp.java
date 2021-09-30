package ch02;

public class Work01Temp {

	public static void main(String[] args) {
		
		//기본타입 값 비교
		int a =10;
		int b=10;
		System.out.println(a==b?"정수타입 변수 a와 정수타입 변수 b의 값이 같습니다.":"정수타입 변수 a와 정수타입 변수 b의 값이 다릅니다.");
		System.out.println(a!=b?"정수타입 변수 a와 정수타입 변수 b의 값이 다릅니다.":"정수타입 변수 a와 정수타입 변수 b의 값이 다르지않습니다.");

		
		//참조타입 값 비교
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1==str2?"str1의 내용와 str2의 참조하는 주소가 같습니다.":"str1의 내용과 str2의 참조하는 주소가 다릅니다.");
		// == 연산자는 객체주소가 같은지 비교하는 것. 
		System.out.println(str1.equals(str2)?"str1의 내용과 str2의 내용이 논리적으로 동등합니다.":"str1의 내용과 str2의 내용이 논리적으로 다릅니다.");
	}

}
