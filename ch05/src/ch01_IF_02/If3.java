package ch01_IF_02;

public class If3 {

	public static void main(String[] args) {
		
		//Integer는 int의 wrapper클래스
		//숫자형 문자열로부터 int타입값 추출메소드
		//Inter.parseInt("정수")
		int num = Integer.parseInt(args[0]);
		if(num>0) {
			System.out.println(num);
		}else {
			System.out.println(-1*num);
		}

	}

}
