package ch05;

public class RunAnimalExam {

	public static void main(String[] args) {
		
		Fish fish = new Fish();
		Bird bird = new Bird();
		Dog dog = new Dog();
		
		System.out.println(fish.name);
		System.out.println(bird.name);
		System.out.println(dog.name);
		fish.run();
		bird.run();
		dog.run();
		

	}

}
