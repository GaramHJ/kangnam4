package ch01;

public class ArrayReferenceObjectExample {

	//p.167
	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		
		//배열 내 저장된 참조 객체의 주소가 같은 지 비교 / 내용이 같은 지 비교
		//String타입 객체 생성 1.변수="문자리터럴"; 2.변수=new String("문자리터럴")
		//"Java" -> 객체로 생성
		strArray[0] = "Java";
		strArray[1] = "Java";
		//new String("Java") 객체 생성
		strArray[2] = new String("Java");
		
		//동일 객체 참조여부 확인 연산 ==
		System.out.println(strArray[0]==strArray[1]?"같은 객체 참조" : "다른 객체 참조");//true
		System.out.println(strArray[0]==strArray[2]?"같은 객체 참조" : "다른 객체 참조");//false
		
		//참조하고 있는 객체의 내용이 같은지 비교하는 방법 - equals()메소드를 사용한다.
		//논리적 동등(equivalence) 비교
		System.out.println(strArray[0].equals(strArray[1])?"참조하는 객체의 내용이 같다":"참조하는 객체의 내용이 다르다");//true
		System.out.println(strArray[0].equals(strArray[2])?"참조하는 객체의 내용이 같다":"참조하는 객체의 내용이 다르다");//false
		
		//참조하고 있는 객체의 내용이 같으므로 hashCode()값이 같음
		System.out.println(strArray[0].hashCode());
		System.out.println(strArray[1].hashCode());
		System.out.println(strArray[2].hashCode());
		
		//물리적 저장공간의 참조주소 확인
		System.out.println(System.identityHashCode(strArray[0]));
		System.out.println(System.identityHashCode(strArray[1]));
		System.out.println(System.identityHashCode(strArray[2]));
	}

}
