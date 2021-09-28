package ch02;

//Ctrl + Shift + O = 불필요한 import 또는 변수를 없애줌
import java.util.Scanner;

public class ArithmeticExam3 {

	public static void main(String[] args) {
		
		int input;
		
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		if(input % 2==0) { //짝수
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}

}
