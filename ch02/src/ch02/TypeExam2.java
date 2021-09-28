package ch02;

public class TypeExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 int x = 10; //정수
		 double y = 15.9; //실수
		 //double 타입의 변수 y를 강제로 int타입으로 변환
		 // (타입)변수
		 // double -> int
		 // 형변환 -> casting
		 
		 int result = x + (int)y;
		 
		 System.out.println(x+y);//실수
		 System.out.println(result); //정수

	}

}
