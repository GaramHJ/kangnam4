package ch01;

public class StringOpExample {

	public static void main(String[] args) {
		
		int a=10;
		a+=5; //+�� ���ϱ� ����, ��� 15
		//a=10 -> a=15
		
		//����Ÿ��
		String str = "hello";
		
		str+="hi";//"hellohi","hi"��ü ����
		str+="bye"; //"hellohibye"��ü ����, "bye"��ü ����
		System.out.println(str);

	}

}
