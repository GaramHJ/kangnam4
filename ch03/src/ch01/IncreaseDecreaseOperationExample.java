package ch01;

public class IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		// 단항연산자 - 증감, ++, --
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++; // 후위연산
		System.out.println(x);
		++x; // 전위연산
		System.out.println(x);
		System.out.println("---------------");
		y--;
		System.out.println(y);
		--y;
		System.out.println(y);
		System.out.println("---------------");
		
		
		// 단독연산이 아닌 다른 연산과 함께 실행되는 경우
		// 전위연산인 경우는 ㅇ
		z=x++;
		System.out.println(z); // 12
		System.out.println(x); // 13
		
		// 현재 x=12, z=10;
		z=++x;
		System.out.println(z); // 14
		System.out.println(x); // 14
		
		z=y--; //현재 y=8, z=14
		System.out.println(z); //8
		System.out.println(y); //7
		
		z=--y; //현재 y=7, z=8
		System.out.println(z); //6
		System.out.println(y); //6
		
		int family = 50;
		family++; //51
		++family; //52
		System.out.println("우리집의 식구는 모두"+((++family)+1)+"명이다"); //family++ = 52인 상태
		System.out.println(family); //53

	}

}
