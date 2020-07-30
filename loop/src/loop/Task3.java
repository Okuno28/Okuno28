package loop;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください：");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		sc.close();

		long keta = 0;
		while (num > 0) {
			keta++;
			num /= 10;
		}
		System.out.print("桁数：" + keta);
	}

}
