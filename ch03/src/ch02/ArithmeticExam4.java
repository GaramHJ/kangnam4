package ch02;

import java.util.Scanner;

public class ArithmeticExam4 {

	public static void main(String[] args) {
		
		int input;
		
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		System.out.println("�����ڸ���:"+(input/10)); //��
		System.out.println("1���ڸ���:"+(input%10)); //������
	}

}
