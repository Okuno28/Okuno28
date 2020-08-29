package standardClass;

public class Task3 {

	public static void main(String[] args) {
		String str = "文字列：ABCDEFG";
		System.out.println(str);

		for(int i = str.length() - 1; i > -1; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
/*想定結果
文字列：ABCDEFFG
GFEDCBA：列字文*/