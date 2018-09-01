package com.capgemini.filehandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.MagicDate;

class MagicDateTest {

	@Test
	void testCheckIfMagicDate() {
		MagicDate date1 = new MagicDate();
		assertEquals("Magic", date1.checkIfMagicDate(LocalDate.of(30, 6, 5)));
	}

}
