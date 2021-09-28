package ch01;

public class StringOpExample {

	public static void main(String[] args) {
		
		int a=10;
		a+=5; //+가 더하기 연산, 결과 15
		//a=10 -> a=15
		
		//참조타입
		String str = "hello";
		
		str+="hi";//"hellohi","hi"객체 생성
		str+="bye"; //"hellohibye"객체 생성, "bye"객체 생성
		System.out.println(str);

	}

}
