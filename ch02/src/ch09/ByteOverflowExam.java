package ch09;

public class ByteOverflowExam {

	public static void main(String[] args) {
		
		//byte의 표현범위는 -128~127 사이를 사이클링함.
		for(int i=-128; i<500;i++) {
			System.out.println(i+":"+(byte)i);
		}

	}

}
