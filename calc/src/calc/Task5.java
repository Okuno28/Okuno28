package calc;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		String price = "ノートPCの値段：";
		int num = 89800;
		char yen = '円';
		String pricetag = price + num + yen;
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		String str3 = str1 + str2;
		System.out.println(pricetag);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);


	}

}
