package branch;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		System.out.println("1から5までの数字を入力してください");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		String x;
		switch (num) {
			case 1:
				x = "Ⅰ";
				break;
			case 2:
				x = "Ⅱ";
				break;
			case 3:
				x = "Ⅲ";
				break;
			case 4:
				x = "Ⅳ";
				break;
			case 5:
				x = "Ⅴ";
				break;
			default:
				x = "unknown";
				break;
		}
		System.out.println(num + "->" + x);

	}

}
