package calc;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		String A="ノートPCの値段：";
		int B=89800;
		char C='円';
		String D=A+B+C;
		Scanner sc = new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		sc.close();
		String str3=str1+str2;
		System.out.println(D);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		
	}

}
