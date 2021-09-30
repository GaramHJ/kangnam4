package ch05;

public class UseCalcExam {

	public static void main(String[] args) {
		
		//객체 생성
		Calculator cal = new Calculator();
		cal.getCalc("+", 10, 20);
		
		//외부에서 접근 가능
		System.out.println(cal.model);
		
		//외부에서 접근 불가
		//System.out.println(cal.result);
		//cal.result=cal.sub(10, 20);
		//System.out.println(cal.result);
		
		//int res = cal.sub(10, 20);
		
		
		//외부에서 수정 불가
		// cal.model="99999"; 
		
		System.out.println(cal.model);

	}

}
