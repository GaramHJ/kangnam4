package ch01_IF_02;

public class If3 {

	public static void main(String[] args) {
		
		//Integer�� int�� wrapperŬ����
		//������ ���ڿ��κ��� intŸ�԰� ����޼ҵ�
		//Inter.parseInt("����")
		int num = Integer.parseInt(args[0]);
		if(num>0) {
			System.out.println(num);
		}else {
			System.out.println(-1*num);
		}

	}

}
