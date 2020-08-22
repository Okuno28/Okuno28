package standardClass;

public class Task3 {

	public static void main(String[] args) {
		String str1 = "文字列：ABCDEFG";
		System.out.println(str1);


		String str2 = "文,字,列,：,A,B,C,D,E,F,G";
		String[] array = str2.split(",");
		for(int i = array.length -1; i > -1; i--) {
			System.out.print(array[i]);
		}

	}

}
/*想定結果
文字列：ABCDEFFG
GFEDCBA：列字文*/