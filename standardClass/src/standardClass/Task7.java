package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task7 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("現在日時：" + date.format(now));

		Calendar today = Calendar.getInstance();
		today.add(Calendar.DAY_OF_MONTH, 7);
		Date nxtweek = today.getTime();
		System.out.println("１週間後：" + date.format(nxtweek));

		today.set(2021, Calendar.AUGUST, 29);
		Date nxtyear = today.getTime();
		SimpleDateFormat dateDay = new SimpleDateFormat("yyyy年MM月dd日(E)");
		System.out.println("１年後　：" + dateDay.format(nxtyear));
	}

}
/*想定結果
現在日時：2020年8月29日
１週間後：2020年9月5日
１年後　：2021年8月29日（土）*/