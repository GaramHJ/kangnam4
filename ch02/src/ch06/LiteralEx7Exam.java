package ch06;

public class LiteralEx7Exam {

	// 자바7 이후의 예외적인 리터럴 초기화
	public static void main(String[] args) {
		
		int price = 20_100; //20100과 동일
		long cardNumber = 1234_5678_1357_9998L; //1234567813579998L과 같음
		long controlBits = 0b10110100_01011011_10110011_11111000;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		int age = 2______5; //25와 동일
		
		//int x = 15_; //오류 : 리터럴 끝이 _ 사용불가
		//double pi = 3_.14; //오류 : 소수점(.) 앞뒤에 _사용불가
		//long idNum = 981231_1234567_L; //오류 : _L(_F) 앞에 사용불가.
		//int y = 0_x15; //오류 : 0x 중간이나 끝이 사용불가. 0x_15(오류)
	}

}
