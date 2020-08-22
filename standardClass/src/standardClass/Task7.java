package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task7 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("現在日時：" + date.format(now));

		Calendar nxtwk = Calendar.getInstance();
		nxtwk.add(Calendar.DAY_OF_MONTH, 7);
		Date nxtweek = nxtwk.getTime();
		System.out.println("１週間後：" + date.format(nxtweek));

		Calendar nxtyr = Calendar.getInstance();
		nxtyr.set(2021, Calendar.AUGUST, 22);
		Date nxtyear = nxtyr.getTime();
		SimpleDateFormat dateDay = new SimpleDateFormat("yyyy年MM月dd日(E)");
		System.out.println("１年後　：" + dateDay.format(nxtyear));
	}

}
/*想定結果
現在日時：2020年8月22日
１週間後：2020年8月29日
１年後　：2021年8月22日（土）*/