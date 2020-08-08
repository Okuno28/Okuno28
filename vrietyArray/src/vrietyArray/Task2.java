package vrietyArray;

import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {
		int[] numbers = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		ArrayList <Integer> odd = new ArrayList<>();
		ArrayList <Integer> even = new ArrayList<>();

		for(int i = 0; i < numbers.length; i++) {
			int divide = numbers[i] % 2;
			if(divide == 0) {
				even.add(numbers[i]);
			}else {
				odd.add(numbers[i]);
			}
		}
		System.out.println("奇数：" + odd);
		System.out.println("偶数：" + even);
	}

}
/*想定結果
 奇数：[21, 3, 99, 51, 1, 87, 11]
 偶数：[32, 6, 72, 78, 26, 48, 60]*/
