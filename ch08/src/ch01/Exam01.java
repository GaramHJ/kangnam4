package ch01;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {


		/*1. ID="hong", PW="1234"
		 * ID와 PW를 scanner로 입력받아서 ID와 PW가 둘 다 같으면 "login성공",
		 * 아니면 "1회 실패하였습니다." 출력
		 * 5회 실패하면, "5회 실패하였습니다. 프로그램을 종료합니다." 출력 후 종료*/
		
		Scanner scanner = new Scanner(System.in);
		
		  int cnt=0;
		  while(true) {
			   String id,pwd;
			   if(cnt==5) {//기본데이타 타입의 값 비교
				   System.out.println(cnt+"회 실패하였습니다. 프로그램을 종료 합니다");
				   break;
			   }
			   System.out.println("아이디와 패스워드를 입력하세요.");
			   System.out.println("아이디>");
			   id=scanner.next();
			   System.out.println("패스워드>");
			   pwd=scanner.next();
	
			if("hong".equals(id)&&"1234".equals(pwd)) {//참조객체의 비교와 논리곱연산
				System.out.println("로그인 성공");break;
			}else {
			cnt++; 
			System.out.println(cnt+"회 실패하였습니다.");
			System.out.println("-----------------------");
			
			}
			
		} System.out.println("프로그램 종료");
		
	}

	}

