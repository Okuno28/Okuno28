package loop;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.print("正の整数を入力してください：");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int x;
		System.out.print(num + "の約数：");
		for (int div = 1; div <= num; div++) {
			x = num % div;
			if (x == 0) {
				System.out.print(div);
				if (div < num) {
					System.out.print(",");
				}
			}
		}

	}

}
