package ch01_IF_02;

import java.util.Scanner;

public class If8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~12까지의 숫자를 입력하세요.");
		
		int num = scanner.nextInt();
		
		if(num==12 || num==1 || num==2) {
			System.out.println("겨울");
		}else if(num==3||num==4||num==5) {
			System.out.println("봄");
		}else if(num==6||num==7||num==8) {
			System.out.println("여름");
		}else if(num==9||num==10||num==11) {
			System.out.println("가을");
		}else {
			System.out.println("범위를 벗어났습니다.");
		}

	}

}
