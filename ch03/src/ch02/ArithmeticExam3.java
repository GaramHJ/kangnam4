package ch02;

// Ctrl + Shift + O = ���ʿ��� import �Ǵ� ������ ������
import java.util.Scanner;

public class ArithmeticExam3 {

	public static void main(String[] args) {
		
		int input;
		
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		if(input % 2==0) { //¦��
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
	}

}
