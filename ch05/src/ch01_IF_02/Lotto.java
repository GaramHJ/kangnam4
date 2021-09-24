package ch01_IF_02;

import java.util.HashSet;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		
		// 1~45 6개의 자연수 무작위 추출하는 프로그램
		// 반복문, Set자료구조 - 중복된 값 저장하지 않음.- 하나의 값만 저장 1,1=>1
		//while(true) 무한반복
		//중복되지 않은 정수를 저장하는 저장소 set에 값 저장
		
		Set<Integer> lottos = new HashSet<Integer>();
				
		while(lottos.size()<6) {
			int num=(int)(Math.random()*45+1);
			System.out.println(num);
			lottos.add(num);//set에 값 저장
		}
		System.out.println(lottos);

	}

}
