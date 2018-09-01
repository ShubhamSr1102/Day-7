package com.capgemini.filehandling.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.TodayDate;

class TodayDateTest {

	@Test
	void testformat() {

		assertEquals("SATURDAY,SEPTEMBER 1,2018", TodayDate.format());
	}

}
