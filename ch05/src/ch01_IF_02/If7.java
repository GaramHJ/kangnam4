package ch01_IF_02;

import java.util.Scanner;

public class If7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(0~100):");
		int score = scanner.nextInt(); //���� �б�
		String grade = "A";
		//���� >= 90, ���� <95 =>A-, 95==A0, ����>95 <=100 => A+
		//���� �� ��
		if(score>=90) {
			grade="A";
			if (score>=90 && score <95) grade = "A-";
			else if (score==95) grade = "A0";
			else if (score>95 && score <=100) grade = "A+";
		}
		
		//������ ���
		
		/* if(score>=90) {
		  	grade="A";
			if(score>95) grade +="+";// "A"+"+" ="A+" // 96~100
    		else if(score==95) grade +="0";//score==95; "A"+"0" ="A0" //95
    		else grade +="-";// "A"+"-" =>"A-"//  90~94
		}
		 */
		else if(score>=80) grade="B"; //90�̸� �߿��� 80�̻�
		else if(score>=70) grade="C"; //80�̸� �߿��� 70�̻�
		else if(score>=60) grade="D"; //70�̸� �߿��� 60�̻�
		else grade = "F"; //������(default) 60�̸� ���
		
		System.out.println("������ " + score + "�̰�, ������ "+grade+"�Դϴ�.");
		
		//�ڿ�����
		scanner.close();
		


	}

}
