package ch02;

public class BitWiseOperationShiftExam01 {

	public static void main(String[] args) {
		
		byte c = 20; //0x14
		byte d = -8; //0xf8
		
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2); //c 값을 2비트 왼쪽으로 시프트
		System.out.println(c>>2); //c 값을 2비트 오른쪽으로 시프트, 왼쪽에 최상위 비트 0 삽입(양수)
		System.out.println(d>>2); //d 값을 2비트 오른쪽으로 시프트, 왼쪽에 최상위 비트 1 삽입(음수)
		
		System.out.printf("%04x\n",d);//shift 이전의 값 = 00f8
									  //				  1111(f) 1000(8) -> (00삽입)0011 1110 (삭제)00
		System.out.printf("%x\n",(byte)(d>>>2)); //d 값을 2비트 오른쪽으로 시프트, 왼쪽에 무조건 0이 삽입됨.
	      //  3   f     f   f       f  f     f    e
	      //0011 1111 1111 1111 1111 1111 1111 1110 (>>> 한 후 int값)
	      //-> (00)+1111 1111 1111 1111 1111 1111 1111 10               00(삭제)
	      //1111 1111 1111 1111 1111 1111 1111 1000 (int)로 변환된 원래값


	}

}
