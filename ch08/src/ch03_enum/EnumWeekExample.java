package ch03_enum;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		//열거타입 변수 선언
		Week today = null;
		
		//칼렌다 타입의 변수 선언, 칼렌다 타입 객체 생성(클래스명.getInstance()) 대입
		Calendar cal = Calendar.getInstance();//칼렌다객체 생성
		int week = cal.get(Calendar.DAY_OF_WEEK);//get(현재의 요일값:Calendqr.DAY_OF_WEEK);
		System.out.println(week);//일요일부터 시작 - 일(1),월(2),화(3),수(4),목(5),금(6),토(7)
		
		//calendar로부터 읽은 요일 숫자값에 따라 요일 출력
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY;break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		System.out.println("오늘은:"+today);//String + 열거상수 => String
		
		//열거상수 비교
		if(today==Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부를 합니다.");
		}

	}

}
