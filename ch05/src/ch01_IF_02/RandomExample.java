package ch01_IF_02;

public class RandomExample {

	public static void main(String[] args) {
	
		// 난수를 이용하여 61~70사이의 무작위의 값 출력
		// 61+0, 61+2, 61+2, 61+3, 61+4, 61+5, 61+6, 61+7, 61+8, 61+9
		int num = (int)(Math.random()*10); //0<=10
		System.out.println(61+num);

	}

}
