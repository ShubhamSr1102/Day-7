package com.capgemini.filehandling.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.DateFormatCheck;

class DateFormatCheckTest {

	@Test
	void testbasic() {

		//Date d1 = new Date(19970602);
		String date="02061997";
		assertEquals("02/06/1997", DateFormatCheck.convert1(date));
		
	}
	
	@Test
	void testformat() {

		//Date d1 = new Date(19970602);
		String date="02061997";
		assertEquals("02 jun,1997", DateFormatCheck.convert2(date));
		
	}

	}


