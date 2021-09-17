package ch02;

// Ctrl + Shift + O = ºÒÇÊ¿äÇÑ import ¶Ç´Â º¯¼ö¸¦ ¾ø¾ÖÁÜ
import java.util.Scanner;

public class ArithmeticExam3 {

	public static void main(String[] args) {
		
		int input;
		
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		if(input % 2==0) { //Â¦¼ö
			System.out.println("Â¦¼ö");
		}
		else {
			System.out.println("È¦¼ö");
		}
	}

}
