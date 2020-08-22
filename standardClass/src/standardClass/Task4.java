package standardClass;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		String str1 = "ABCDGOPQRSYZ";

		Scanner sc = new Scanner(System.in);
		String str2 = sc.nextLine();
		sc.close();

		System.out.println("探したい文字：" + str2);
		int contain = str1.indexOf(str2);
		if(contain > -1) {
			System.out.println(str1 + "は" + str2 + "を含む");
		}else {
			System.out.println(str1 + "は" + str2 + "を含まない");
		}
	}
}
/*想定結果
探したい文字：AY
ABCDGOPQRSYZはAYを含まない

探したい文字：AB
ABCDGOPQRSYZはABを含む

探したい文字：G
ABCDGOPQRSYZはGを含む

*/