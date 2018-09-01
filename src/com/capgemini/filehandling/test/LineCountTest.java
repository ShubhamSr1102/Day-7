package com.capgemini.filehandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.LineCount;

class LineCountTest {

	@Test
	void testLineCount() {
		File file = new File(
				"C:\\Users\\shusriva\\Documents\\Shubham Srivastava Java Cloud\\Day 6\\src\\com\\capgemini\\collections\\CellPhone.java");

		assertEquals(89, LineCount.count(file));
	}

}
