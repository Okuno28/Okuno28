package standardClass;

public class Task5 {

	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		String[] array = str.split("_");
		int catnumber = 0, mousenumber = 0;
		String animal = "";

		for(int i = 0; i < array.length; i++) {
			if(array[i].contentEquals("cat")) {
				catnumber++;
			}else if (array[i].contentEquals("mouse")) {
				mousenumber++;
			}
		}

		if(catnumber > mousenumber) {
			animal = "cat";
		}else if(catnumber < mousenumber) {
			animal = "mouse";
		}
		System.out.println(animal + "の方が多い");
	}

}
/*想定結果
catの方が多い*/