package loop;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int total = 0;

		for(int i = 1; i <= num; i++) {
			total += i;
			System.out.print(i);
			if (i < num) {
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
	}

}
