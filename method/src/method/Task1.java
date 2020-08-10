package method;

public class Task1 {

	public static void main(String[] args) {
		String name = "奥野早貴";
		int age = 24;
		double height = 164.2;
		myProfile(name, age, height);
		System.out.print("よろしくお願いします。");

	}
	public static void myProfile (String name, int age, double height) {
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
	}
}
/*想定結果
私の名前は奥野早貴です。
年齢は24歳です。
身長は164.2cmです。
よろしくお願いします。*/