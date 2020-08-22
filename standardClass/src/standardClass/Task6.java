package standardClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task6 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(date.format(now));
		SimpleDateFormat dateTime = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");
		System.out.println(dateTime.format(now));

	}

}
/*想定結果
2020年8月22日
2020年8月22日12時13分*/