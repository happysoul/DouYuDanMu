package cn.happysoul.douyu.demoApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import cn.happysoul.douyu.douyuFormat.Logger;
import cn.happysoul.douyu.persistence.DatabaseHelper;
import cn.happysoul.douyu.util.Utils;

public class MySqlMain {

	public static void main(String[] args) {
		DatabaseHelper db = DatabaseHelper.getInstance();
		// db.selectTopByBnn(10);

		String start = "2017-08-16 19:40:00";
		String end = "2017-08-16 23:59:59";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		try {
			Logger.v(Utils.outputTxt(db.selectAllByTime(sdf.parse(start), sdf.parse(end))));
			// db.selectByTimeInterval(sdf.parse(start), sdf.parse(end), 60);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
