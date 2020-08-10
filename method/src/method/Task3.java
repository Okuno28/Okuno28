package method;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("--①文字列だけの場合---");
		System.out.println(add("文字列1", "文字列2"));
		System.out.println("---②整数だけの場合----");
		System.out.println(add(3, 5));
		System.out.println("---③小数だけの場合----");
		System.out.println(add(3.5, 5.5));

	}
	public static String add(String one, String two) {
		return one + two;
	}
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
}
/*想定結果
--①文字列だけの場合---
文字列1文字列2
---②整数だけの場合----
8
---③小数だけの場合----
9.0
*/