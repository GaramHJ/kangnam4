package ch01_If;

import java.util.Scanner;

public class NestedIfExam {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	      System.out.print("������ �Է��ϼ���(0~100): ");
	      
	      //int Ÿ�� �� �Է�
	      int score = scanner.nextInt(); 

	      System.out.print("�г��� �Է��ϼ���(1~4): ");
	      //intŸ�� �� �Է�
	      int year = scanner.nextInt(); 
	      //if�� ���� if~else if~else��

	      if(score >= 60) { // 60�� �̻�
	         if(year != 4)
	            System.out.println("�հ�!"); // 4�г� �ƴϸ� �հ�
	         else if(score >= 70) //70�� �̻��̸� �հ�
	            System.out.println("�հ�!"); // 4�г��� 70�� �̻��̸� �հ�
	      else
	         System.out.println("���հ�!"); // 4�г��� 70�� �̸��̸� ���հ�
	      }
	      else // 60�� �̸� ���հ�
	         System.out.println("���հ�!");

	      scanner.close();


	}

}
