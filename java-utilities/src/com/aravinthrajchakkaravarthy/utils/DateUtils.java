package com.aravinthrajchakkaravarthy.utils;

import java.util.Calendar;

/**
 * @author aravinthrajchakkaravarthy
 *
 */

import java.util.Date;
import java.text.SimpleDateFormat;
public class DateUtils {

	private static final String EMPTY_STRING="";
	
	/**
	 * Date Utils constructor
	 * */
	public DateUtils() {
		System.out.println("Inside DateUtils");
	}
	
	/**
	 * This method will convert Date to String in given format
	 * 
	 * @param dateToChanged
	 * @param format
	 * @return Date in String format
	 */
	public static String getDateInStringFormat(Date dateToChanged,String format) {
		String result=EMPTY_STRING;
		if(dateToChanged != null && format != null) {
			SimpleDateFormat df=new SimpleDateFormat(format);
			result=df.format(dateToChanged);
		}
		return result;
	}
	
	/**
	 * This method convert Date to DOP for an given date
	 * @param date
	 * @return DOP
	 */
	public static int getDaysofWeek(Date date){
	    if(date !=null){
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			int day = c.get(Calendar.DAY_OF_WEEK);
			if(day==1){
				day = 7;
			} else {
				day = day-1;
			}
			return day;
	    }
	    return 0;		
	}
}
