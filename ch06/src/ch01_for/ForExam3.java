package ch01_for;

public class ForExam3 {

	public static void main(String[] args) {
		
		//�ʱ�ȭ �κ��̳� �����κп� ,�� ��ɹ��� ������ �� ����.
		//for(�ʱ�ȭ;for���� ���������� ����;����){���๮;}
		for(int i=1,y=1; i<10 ;i++,System.out.println(y)) {//for ���� ���������� ������ ���� ���, ������ true�� ����.
			System.out.println(i+"hello");
			//for���� ���������� ������ �������� ó��{}
			if(i==10)break;//���� ���������� ��ɹ� break;
			y++;
		}
		System.out.println("����");
		// if,break ������ ���ѷ����� ����

	}

}
