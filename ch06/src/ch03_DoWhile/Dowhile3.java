package ch03_DoWhile;

import java.util.Scanner;

public class Dowhile3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num=0, i=1;
		do {
			System.out.println("보고싶은 구구단 숫자를 입력하세요.");
			num = scanner.nextInt();
			if(num<=9&&num>=2) {
				do {
					System.out.print(num+"*"+i+"="+(num*1)+"\t");
					i++;
				}while(i<=9);
			}
		}while(num>9 || num<2); //블럭을 벗어나는 조건
	}

}
