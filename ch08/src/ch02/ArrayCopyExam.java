package ch02;

public class ArrayCopyExam {

	public static void main(String[] args) {
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];//[null][null][null][null][null]
		
		//for(int i=0;i<oldStrArray.length;i++)
		//	newStrArray[i] = oldStrArray[i];//["java"]["array"]["copy"][null][null]
		

		//System.arrayCopy()
		//arraycopy(소스,소스의시작,index,타켓,타켓의시작index,복사할 길이)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		
		for(int i=0;i<newStrArray.length;i++)
			System.out.print(newStrArray[i]+" ");
		
		System.out.println("\n--------------------------");
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(int i=0;i<newStrArray.length;i++)
			System.out.print(newStrArray[i]+" ");
		
		
		
		
		

	}

}
