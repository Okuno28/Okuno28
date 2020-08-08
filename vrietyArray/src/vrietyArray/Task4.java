package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class Task4 {

	public static void main(String[] args) {
		int[] numbers = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
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
		HashMap <String, ArrayList<Integer>> result = new HashMap<>();
		result.put("奇数：", odd);
		result.put("偶数：", even);
		System.out.print(result);
	}

}
/*出力はmap変数を指定
想定結果
{偶数： = [], 奇数： = []}*/