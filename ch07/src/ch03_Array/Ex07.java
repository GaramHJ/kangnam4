package ch03_Array;

public class Ex07 {

	public static void main(String[] args) {
		
		//1���� �迭�� �ִ밪 �ּҰ� ���ϱ�
		int[] score = {76,45,34,89,100,50,90,92};
		//max������ �迭�� ���麸�� �����ϰ� ������ �����Ͽ� ����
		//min������ �迭�� ���麸�� �����ϰ� ū �� �����Ͽ� ����
		int sum = 0, max = 0, min = 100;
		
		//���� for������ �����ؼ� �ִ밪, �ּҰ�, �հ�, ����� ����Ͻÿ�.
		
		for(int i :score) {
			sum+=i;
			if(max <i) max=i; //max������ score���� ũ�� ��ȯ
			if(min >i) min=i; //min������ score���� ������ ��ȯ
		}
		System.out.println("�ִ밪:"+max);
		System.out.println("�ּҰ�:"+min);
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+sum/(double)score.length);

	}

}
