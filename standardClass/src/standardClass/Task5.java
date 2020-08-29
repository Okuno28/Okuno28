package standardClass;

public class Task5 {

	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		String[] array = str.split("_");
		int catNumber = 0, mouseNumber = 0;
		String animal = "";

		for(int i = 0; i < array.length; i++) {
			if(array[i].contentEquals("cat")) {
				catNumber++;
			}else if (array[i].contentEquals("mouse")) {
				mouseNumber++;
			}
		}

		if(catNumber > mouseNumber) {
			animal = "cat";
		}else if(catNumber < mouseNumber) {
			animal = "mouse";
		}
		System.out.println(animal + "の方が多い");
	}

}
/*想定結果
catの方が多い*/