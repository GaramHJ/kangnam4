package ch03_enum;

import java.util.Scanner;

public class EnumMethodExample {
/*열거타입 메소드들*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//name()메소드
		Week today = Week.SUNDAY;
		// String name = today; //name=String타입, today=열거타입이라 오류
		String name = today.name(); //열거타입 상수 -> String타입으로 변환
		System.out.println(name);
		
		//ordinal()메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo()메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); //결과값:-2 -> 월요일은 수요일보다 -2일
		int result2 = day2.compareTo(day1); //결과값:2 -> 수요일은 월요일보다 +2일
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드 : String -> 열거
		System.out.println("요일을 열거상수 형식으로 입력해주세요.");
		String strDay = scanner.next();
		Week weekDay = Week.valueOf(strDay); //스캐너로 입력받은 문자열을 -> Week상수로 변환
		if(weekDay == Week.SATURDAY||weekDay==Week.SUNDAY) {
			System.out.println("주말이군요.");
		}else {
			System.out.println("평일이군요.");
		}
		
		//switch문으로도 가능
		/*switch(week) {
		case 0:
		case 1: 
		case 2: 
		case 3: 
		case 4: today = System.out.println("평일이군요.");break;
		case 5: 
		case 6: today = System.out.println("주말이군요."); break;
		}*/
		
		//values()메소드
		Week[] days = Week.values();
		for(int i=0;i<days.length;i++)
			System.out.print(days[i]+" ");
		System.out.println();
		
		for(Week d:days)
			System.out.print(d+" ");
		
		

	}

}
