package ch01;

public class Ex01 {

	public static void main(String[] args) {
		
		//1. 배열 변수 선언 후 나중에 객체 생성하여 대입
		int[] intArr1;
		System.out.println("이제부터 배열객체 생성하여 참조변수에 대입");
		intArr1 = new int[5];
		
		//2.배열 변수 선언과 저장공간 길이를 가지고 객체를 생성하여 대입
		int[] intArr2=new int[5];
		
		//3.배열 변수 선언과 동시에 초기값으로 배열객체 생성하여 대입
		int[] intArr3= {1,2,3,4,5};
		System.out.println(intArr3.length);//참조변수.length는 저장되는 요소의 개수,생성시 확정, 수정불가.
		
		//4.배열 변수 선언 후 나중에 초기값으로 배열객체 생성하여 대입
		int[] intArr4;
		System.out.println("이제부터 배열객체 생성하여 참조변수에 대입");
		intArr4=new int[] {1,2,3,4,5};

	}

}
