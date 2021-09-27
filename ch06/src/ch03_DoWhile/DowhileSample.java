package ch03_DoWhile;

public class DowhileSample {

	public static void main(String[] args) {
		
		
		char c = 'a';
		
		do {
			System.out.print(c);
			System.out.print(c+1);
			c=(char)(c+1);
			// System.out.println(c);
		}while(c<='z');

	}

}
