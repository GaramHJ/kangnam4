package ch03;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String args[]) { 
		
		//println() = print and new line(�����ٷ� �̵�)
		//print() = ���� �ٿ��� ��� �̾ ���
	      System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
	      // ��ĳ��Ÿ�� ���� ���� �� ��ü ����
	      Scanner scanner = new Scanner(System.in);
	      
	      String name = scanner.next(); // String next()
	      System.out.print("�̸��� " + name + ", ");
	      
	      String city = scanner.next(); // String next()
	      System.out.print("���ô� " + city + ", ");
	      
	      int age = scanner.nextInt(); // int nextInt()
	      System.out.print("���̴� " + age + "��, ");
	      
	      double weight = scanner.nextDouble(); // double nextDouble()
	      System.out.print("ü���� " + weight + "kg, ");
	      
	      boolean single = scanner.nextBoolean(); // boolean nextBoolean()
	      System.out.println("���� ���δ� " + (single?"�̱�":"����") + "�Դϴ�.");
	      
	      scanner.close(); // �ڿ�����
	   }
	}