package method;

public class Task4 {

	public static void main(String[] args) {
		String [] array1 = {"a", "b", "c"};
		String [] array2 = {"a", null, "c"};

		System.out.println(nullCheck(array1));
		System.out.print(nullCheck(array2));
	}

	public static boolean nullCheck(String [] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == null) {
				System.out.println("---配列にnullがある場合---");
				return true;
			}
		}
		System.out.println("---配列にnullがない場合---");
		return false;
	}
}
/*想定結果
---配列にnullがない場合---
false
---配列にnullがある場合---
true*/