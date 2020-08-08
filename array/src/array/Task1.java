package array;

public class Task1 {

	public static void main(String[] args) {
		System.out.print("配列：[");
		int[] array = {4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		int sum = 0;
		for(int number:array) {
			sum += number;
		}
		System.out.print("合計：" + sum);
	}

}
