package ch01;

public class Ex06 {

	public static void main(String[] args) {
		
		String[] snake = {"구렁이","팔렁이","칠렁이","육렁이","오렁이"};
		
		for(int i=0; i<snake.length;i++)
			System.out.print(snake[i]+" ");
		System.out.println();
		
		for(int i=(snake.length-1);i>=0;i--)
			System.out.print(snake[i]+" ");
		System.out.println();
		
		//향상된 for문을 이용하여 출력
		for(String s : snake)
			System.out.print(s+" ");
		System.out.println();

	}

}
