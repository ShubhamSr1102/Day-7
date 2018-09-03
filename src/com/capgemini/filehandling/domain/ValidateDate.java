package com.capgemini.filehandling.domain;

import java.time.LocalDate;
import java.util.Arrays;

public class ValidateDate {
	public static boolean MyDate(int day, int month, int year) throws Exception {

		if (month == 2 && year % 4 != 0 && (day < 1 || day > 28))
			throw new Exception();

		if (month == 2 && year % 4 == 0 && (day < 1 || day > 29))
			throw new Exception();

		if (month < 1 || month > 12)
			throw new Exception();

		if (day < 1 || day > 31)
			throw new Exception();

		int monthCheck[] = { 1, 3, 5, 7, 8, 10, 12 };

		if (Arrays.binarySearch(monthCheck, month) < 0) {
			if (day < 1 || day > 30)
				throw new Exception();
		}
		return true;

	}

	public static String validate(String string, int days) throws Exception {

		String monthNumber = "" + string.charAt(3) + string.charAt(4);
		int month = Integer.parseInt(monthNumber);
		String dateNumber = "" + string.charAt(0) + string.charAt(1);
		int date = Integer.parseInt(dateNumber);
		String yearNumber = "" + string.substring(6);
		int year = Integer.parseInt(yearNumber);

		if (MyDate(date, month, year)) {
			LocalDate d2 = (LocalDate.of(year, month, date).plusDays(days));

			String str = "" + d2;
			return str.substring(8) + "/" + str.substring(5, 7) + "/" + str.substring(0, 4);

		}
		return "Error";

	}

}
