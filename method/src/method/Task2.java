package method;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("三角形の面積");
		System.out.print(getTriangleArea(27.0, 10.0));
	}
	public static double getTriangleArea(double base, double height) {
		return Math.round(base * height / 2);
	}
}
/*三角形の面積
135.0*/