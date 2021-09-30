package ch02;

public class ArrayCopyExam3 {

	public static void main(String[] args) {
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];//[null][null][null][null][null]

		//System.arrayCopy() - 깊은 copy, 새로운 배열을 생성한 후에 사용
		//arraycopy(소스,소스의시작,index,타켓,타켓의시작index,복사할 길이)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		
		for(int i=0;i<newStrArray.length;i++)
			System.out.print(newStrArray[i]+" ");
		
		
		System.out.println("\n--------------------------");
		//java.lang.ArrayIndexOutOfBoundsException : 소스의 개수가 2개인데 타겟 배열의 인덱스 번호를 초과 시 오류발생.
		System.arraycopy(oldStrArray, 1, newStrArray, 3, oldStrArray.length-1);
		for(int i=0;i<newStrArray.length;i++)
			System.out.print(newStrArray[i]+" ");
		
		System.out.println();
		int srcPos = 1;
		int num = oldStrArray.length - srcPos; // 3-1 = 2
		System.arraycopy(oldStrArray, 1, newStrArray, 3, num);
		for(int i=0;i<newStrArray.length;i++)
			System.out.print(newStrArray[i]+" ");
		
		
		
		
		
		

	}

}
