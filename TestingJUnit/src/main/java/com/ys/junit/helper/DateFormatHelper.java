package com.ys.junit.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatHelper {
	
	public String formateDateYYYYMMDD(String date) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date formatedDate=dateFormat.parse(date);
		return sdf.format(formatedDate);
	}
	
}
