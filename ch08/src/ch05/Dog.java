package ch05;

public class Dog extends Animal{
	String name ="댕댕이";

	@Override
	void run() {
		System.out.println(name+"가 뛰어갑니다.");
	}

}
