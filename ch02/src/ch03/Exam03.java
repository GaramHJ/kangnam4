package ch03;

public class Exam03 {

	public static void main(String[] args) {
	
		// 체지방량 계산공식
		// 체지방율 chR = 몸무게 - 체지방량;
		// 남성표준 체지방량 = (1.10*체중kg) - (128*(체중kg^2/키cm^2))
		// 체중 : 75kg, 키 : 175cm인 남성의 표준 체지방량은 얼마입니까?
		
		final double ST1 = 1.10;
		final int ST2 = 128;
		
		int weight = 75;
		int height = 175;
		double x1 = ST1*weight;
		int ww = weight*weight;
		int hh = height*height;
		
		System.out.println("ww:"+ww);
		System.out.println("hh:"+hh);
		
		double w1 = ww / hh;
		// 정수/정수 -> 정수
		
		double w2 = ST2*w1;
		
		System.out.println("x1:"+x1);
		System.out.println("w1:"+w1);
		System.out.println("w2:"+w2);
		
		double result = ST1*weight - (ST2*((double)(weight*weight)/(double)(height*height)));
		
		System.out.println(result);
		
		// 과제 : 체지방율 구하기
		
		double BMI = weight - result;
		
		System.out.println(BMI);
		

	}

}
