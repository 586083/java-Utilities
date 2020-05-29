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
	 * 
	 */
	public DateUtils() {
		System.out.println("Inside DateUtils");
	}
	
	public static String getDateInStringFormat(Date dateToChanged,String format) {
		String result=EMPTY_STRING;
		if(dateToChanged != null && format != null) {
			result=result+EMPTY_STRING;
			result=result.substring(0,1);
		}
		return result;
	}
}
