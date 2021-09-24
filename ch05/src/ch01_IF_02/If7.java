package ch01_IF_02;

import java.util.Scanner;

public class If7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100):");
		int score = scanner.nextInt(); //점수 읽기
		String grade = "A";
		//점수 >= 90, 점수 <95 =>A-, 95==A0, 점수>95 <=100 => A+
		//내가 한 것
		if(score>=90) {
			grade="A";
			if (score>=90 && score <95) grade = "A-";
			else if (score==95) grade = "A0";
			else if (score>95 && score <=100) grade = "A+";
		}
		
		//선생님 답안
		
		/* if(score>=90) {
		  	grade="A";
			if(score>95) grade +="+";// "A"+"+" ="A+" // 96~100
    		else if(score==95) grade +="0";//score==95; "A"+"0" ="A0" //95
    		else grade +="-";// "A"+"-" =>"A-"//  90~94
		}
		 */
		else if(score>=80) grade="B"; //90미만 중에서 80이상
		else if(score>=70) grade="C"; //80미만 중에서 70이상
		else if(score>=60) grade="D"; //70미만 중에서 60이상
		else grade = "F"; //나머지(default) 60미만 모두
		
		System.out.println("점수는 " + score + "이고, 학점은 "+grade+"입니다.");
		
		//자원해제
		scanner.close();
		


	}

}
