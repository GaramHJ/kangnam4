package ch05_Continue;

public class Continue4 {

	public static void main(String[] args) {
		
		//이중 for문내의 continue;
	Label: for(int i=0;i<=9;i++) {
			System.out.print("i="+i+"\t");
			for(int j=0;j<=9;j++) {
				System.out.print("j="+j);
				if(j>2) continue Label;// continue를 감싸는 가장 가까운 블럭의 for시작으로 이동.
				System.out.print("나두 출력되나\t");
			}
			System.out.println();//한줄 아래로 내리기는 출력 안됨.
		}

	}

}
