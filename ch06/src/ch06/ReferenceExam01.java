package ch06;

public class ReferenceExam01 {

	public static void main(String[] args) {
		
		//���ͷ��� ���ڿ� ����
		String strA = "ȫ�浿";
		String strB = "ȫ�浿";
		if(strA==strB) System.out.println("���� ���ڿ��� �����Ѵ�.");
		else System.out.println("�ٸ� ���ڿ��� �����Ѵ�.");
		
		//new String() - �����ڷ� ���ڿ� ����
		String str1 = new String("ȫ�浿");
		String str2 = new String("ȫ�浿");
		if(str1==str2) System.out.println("���� ���ڿ��� �����Ѵ�.");
		else System.out.println("�ٸ� ���ڿ��� �����Ѵ�.");

		//
		str1="������";
		str1="ȫ�浿������";
		
	}

}
