package standardClass;

public class Task2 {

	public static void main(String[] args) {
		String str = "Java Programming Training";
		String training = str.substring(17);
		String java = str.substring(0,17);

		System.out.println(training);
		System.out.println(java);

	}

}
/*想定結果
Training
Java Programming*/