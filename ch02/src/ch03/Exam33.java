package ch03;

public class Exam33 {

	public static void main(String[] args) {
		
		int w1 = 75;
		int h1 = 175;
		
		final double ST1 = 1.10;
		final int ST2 = 128;
		
		double ww = w1 * w1;
		double hh = h1 * h1;
		
		double mess1 = (ST1*w1) - (ST2*(ww/hh));
		System.out.println("�����淮:"+mess1);
		
		double BMI1 = w1 - mess1;
		System.out.println("ü���淮:"+BMI1);
		
		double mess2 = (mess1*100)/w1;
		System.out.println("�������:"+mess2);
		
		double BMI2 = 100-mess2;
		double result2 = (BMI1*100)/w1;
		
		System.out.println("ü�����1:"+BMI2);
		System.out.println("ü�����2:"+result2);
		
		
		

	}

}
