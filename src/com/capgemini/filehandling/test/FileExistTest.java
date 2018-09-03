package com.capgemini.filehandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistTest {

	@Test
	void testExistence() {
		File file = new File(
				"C:\\Users\\shusriva\\Documents\\Shubham Srivastava Java Cloud\\Day 6\\src\\com\\capgemini\\collections");
		assertEquals(true, file.exists());
		assertEquals(false, file.isFile());

	}

}
