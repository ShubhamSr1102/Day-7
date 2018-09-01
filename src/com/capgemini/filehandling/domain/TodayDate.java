package com.capgemini.filehandling.domain;

import java.time.LocalDate;

public class TodayDate {

	public static String format() {

		LocalDate.now();
		String today = LocalDate.now().getDayOfWeek() + "," + LocalDate.now().getMonth() + " "
				+ LocalDate.now().getDayOfMonth() + "," + LocalDate.now().getYear();
		return today;
	}

}
