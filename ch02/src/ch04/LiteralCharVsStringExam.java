package ch04;

public class LiteralCharVsStringExam {

	public static void main(String[] args) {
		
		// ����Ÿ�� ������ ���� �ϳ��� �����ϴ� ����
		// ' ' ���̿� ������ ������ ���� �߻�
		//char c1 = '';'
		char c1 = ' '; //���ͷ� ���� �� ���� ����.
		
		
		// ���ڿ� Ÿ�Ժ����� " " ���̿� ������ ��� ����.
		String s1 = "";
		
		// ���� \���� ���ڴ� Ư���뵵�� ���ڷ� ��ȯ
		//System.out.println("\"); -> \ȥ�� ����� �� ����.
		
		// \+u�� �����ڵ��� �ǹ̸� ǥ���ϴ� ������� ����.
		System.out.println("\2u"); //����2 �����ϰ� �� ��
		System.out.println("u");

	}

}
