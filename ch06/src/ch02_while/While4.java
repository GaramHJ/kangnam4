package ch02_while;

import java.io.IOException;

public class While4 {

	public static void main(String[] args) {
		
		
		System.out.println("2~9������ ���ڸ� �Է��ϼ���.");
		
		//Ű����� ���� 0�� ������ �ԷµǴ� ����? 48 <-ASCII�ڵ尪
		try {
			int num = System.in.read()-'0';//ǥ���Է� ��Ʈ�� '0'Ű�� ���� ��� : 48-48, '1' => 49-48 = 1
			System.out.println("������"+num+"��");
			if(num>=2&&num<=9) {
			int i = 1;
			while(i<=9) {//while����{}�� ���������� ����
				System.out.println(num+"*"+i+"="+(i*num));//���
				i++;//�������ɹ�
				}
			}else {
				System.out.println("2~9������ ���ڸ� �Է��ϼ���!!");
			}
		} catch (IOException e) {
			
			System.out.println("�����߻�"); //�����̳� Ű����� ��ü�� ������ ����� �� �ϵ���� ������ ���
		} 

	}

}