package ch02;

public class IncreaseExam {

	public static void main(String[] args) {
		int x = -1;
		// x++; //0
		
		// 현재의 x값을 연산에 사용하고 싶다.
		if(5/(x++)==5) { // -5 =/= 5
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		

		//증가된 x의 값을 출력하고 싶다.
		System.out.println(x);

	}

}
