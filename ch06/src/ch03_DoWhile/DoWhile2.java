package ch03_DoWhile;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num=0;
		do {
			System.out.println("짝수를 입력하세요:");
			num = scanner.nextInt();
			
		}while(num%2!=0); //num을 2로 나누었을 때 나머지가 0이 아닌 경우
		System.out.println("당신이 입력한 짝수:"+num);

	}

}
