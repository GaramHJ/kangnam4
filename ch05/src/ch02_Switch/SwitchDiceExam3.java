package ch02_Switch;

public class SwitchDiceExam3 {

	// 주사위(dice) 1~6 눈을 가진 주사위
	public static void main(String[] args) {
		
		int num ;
		// 0+1 <=(int)(Math.random()*6)+1<6+1
		
		num = (int)(Math.random()*6)+1; //1~6 중 랜덤
		
		switch(num) {//변수
		case 1: System.out.println("1번이 나왔습니다."); break; //switch문을 빠져나가는 명령문
		case 2: System.out.println("2번이 나왔습니다."); break;
		case 3: System.out.println("3번이 나왔습니다."); break;
		case 4: System.out.println("4번이 나왔습니다."); break;
		case 5: System.out.println("5번이 나왔습니다."); break;
		default : System.out.println("6번이 나왔습니다."); 
		}
		
	}

}
