package object;

public class Dog extends Animal{
	public double weight;
	//コンストラクタ
	public Dog() {};
	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public void run() {
		System.out.println(this.name + "は走った");
	}
	public void sleep() {
		System.out.print(this.name + "は");
		super.sleep();
	}
}
