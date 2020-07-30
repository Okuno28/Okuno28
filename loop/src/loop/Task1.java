package loop;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力してください：" );
		int num = sc.nextInt();
		sc.close();

		int total = 0;

		for (int i = 1; i <= num; i++) {
			total += i;
		}

		System.out.println("1～" + num + "までの合計：" + total);
	}

}
