package ch04;

public class EscapeExam {

	public static void main(String[] args) {
		
		//escape - 원래문자
		
		String message = "hello\n my\t name is \"홍길동\", \n my favorite \'toys\', 디렉토리 c:\\temp";
		System.out.println(message);
		
		String message2 = "hello n my t name is \"홍길동\", n my favorite 'toys', 디렉토리 c:\temp";
		System.out.println(message2);

	}

}
