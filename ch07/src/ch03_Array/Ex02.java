package ch03_Array;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] n = new int[5];
		n[0]=12; n[1]=20;
		n[2]=67; n[3]=567;
		n[4]=21;
		
		System.out.println("�迭�� ����� ����:"+n.length);
		for(int i=0;i<n.length;i++) {
			System.out.println("n["+i+"] = "+n[i]);
		}
		
		System.out.println("=================");
		System.out.println("���� for�� �ڹ�1.5���� ����.");
		
		//�迭��ü�� ó������ ������ �� ���� �ݺ��ϸ鼭
		//�д� '�ݺ���(iterator)'�� �����Ͽ� ��� - ���� for��
		for(int k:n) {
			System.out.println(k+"\t");
		}

	}

}