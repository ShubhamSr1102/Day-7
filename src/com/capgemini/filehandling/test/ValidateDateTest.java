package com.capgemini.filehandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.ValidateDate;

class ValidateDateTest {

	@Test
	void testValidateDate() throws Exception {

		assertEquals("04/06/1997", ValidateDate.validate("02/06/1997", 2));
	}

}
