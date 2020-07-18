package calc;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int a = (num1 + num2 + num3);
		int x = 3;
		int b = (a / x);
		double y = 3.0;
		double c = (a / y);
		sc.close();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("合計：" + a);
		System.out.println("平均（"+ x +"で割った時）：" + b);
		System.out.println("平均（" + y +"で割った時）：" + c);

	}

}
