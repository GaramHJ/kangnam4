package ch03_DoWhile;


public class Dowhile4 {

	public static void main(String[] args) {
		
		int i=1, j=2;
		//��ø do~while������ ������ ���
		do {
			do {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				j++;//����
		}while(j<=9);
		i++;//����
		j=2;//�ʱ�ȭ
		System.out.println();

	}while(i<=9);

}
}