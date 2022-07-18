package com.ovd.citymall;

import java.util.regex.Pattern;

public class MyUtils {

	private static Pattern amountPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
	private static Pattern intPattern = Pattern.compile("^\\d+$");

	public static boolean isAmount(String strNum) {
		if (strNum == null) {
			return false;
		}
		return amountPattern.matcher(strNum).matches();
	}

	public static boolean isInt(String strNum) {
		if (strNum == null) {
			return false;
		}
		return intPattern.matcher(strNum).matches();
	}
}
