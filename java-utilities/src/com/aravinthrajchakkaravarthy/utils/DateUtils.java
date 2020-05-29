package com.aravinthrajchakkaravarthy.utils;

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
}
