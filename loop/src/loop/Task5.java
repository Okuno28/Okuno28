package loop;

public class Task5 {

	public static void main(String[] args) {
		int answer;
		for (int x = 1; x < 10; x++) {
			for(int y = 1; y < 10; y++) {
				answer = x * y;
				if(answer < 10)  {
					System.out.print("  " + answer);
				}else {
					System.out.print(" " + answer);
				}
			}
			System.out.println("");
		}
	}

}
