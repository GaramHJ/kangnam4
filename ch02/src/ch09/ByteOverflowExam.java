package ch09;

public class ByteOverflowExam {

	public static void main(String[] args) {
		
		//byte�� ǥ�������� -128~127 ���̸� ����Ŭ����.
		for(int i=-128; i<500;i++) {
			System.out.println(i+":"+(byte)i);
		}

	}

}
