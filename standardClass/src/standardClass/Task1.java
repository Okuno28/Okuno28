package standardClass;

public class Task1 {

	public static void main(String[] args) {
		String str1 = " tech-compass ";
		String str2 = str1.trim();
		String str3 = str2.toUpperCase();

		System.out.println("変換前：" + str1);
		System.out.println("変換後：" + str3);
	}

}
/*想定結果
変換前： tech-compass
変換後：TECH-COMPASS
*/