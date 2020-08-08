package vrietyArray;

import java.util.HashMap;

public class Task3 {

	public static void main(String[] args) {
		HashMap <String, Integer> price = new HashMap<>(4);
		price.put("りんご", 130);
		price.put("みかん", 120);
		price.put("バナナ", 98);
		price.put("メロン", 6000);

		for(HashMap.Entry<String, Integer> tag: price.entrySet()) {
			System.out.print(tag.getKey());
			System.out.print("：");
			System.out.print(tag.getValue());
			System.out.println("円");
		}
	}

}
/*想定結果
りんご：130円
メロン：6000円
みかん：120円
バナナ：98円
HashMapでは順番の固定ができないようなので（質問チャンネルにて確認）この状態で提出いたします。*/