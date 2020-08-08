package vrietyArray;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<String> area = new ArrayList<>();
		area.add("北海道");
		area.add("東北");
		area.add("関東");
		area.add("中部");
		area.add("近畿");
		area.add("中国");
		area.add("九州");

		for(String japan : area) {
			System.out.println(japan);
		}

	}

}

/* 想定結果
 北海道
 東北
 関東
 中部
 近畿
 中国
 九州*/
