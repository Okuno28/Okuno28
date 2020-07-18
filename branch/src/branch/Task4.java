package branch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		sc.close();
		System.out.println("numA:" + numA);
		System.out.println("numB:" + numB);
		if(numA < 0 & numB < 0) {
			System.out.println("正の数を入力してください。");
		}else if (numA % numB==0) {
			System.out.println(numB + "は" + numA + "の約数です。");
		}else {
			System.out.println(numB + "は" + numA + "の約数ではありません。");
		}

	}

}
