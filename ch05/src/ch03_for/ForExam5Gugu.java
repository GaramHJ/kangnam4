package ch03_for;

import java.util.Scanner;

public class ForExam5Gugu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("보고싶은 구구단은?");
		int num = scanner.nextInt();
		System.out.println("구구단"+num+"단");
		for(int i=1; i<=9;i++) {
			System.out.println(num+"*"+i+"="+i*num);
			//System.out.print(num+"*"+i+"="+i*num+"\t");
		}

	}

}
