package com.capgemini.filehandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.PatternSearch;

class PatternSearchTest {

	@Test
	void testPatternSearch() throws FileNotFoundException, IOException {
		File file = new File(
				"C:\\Users\\shusriva\\Documents\\Shubham Srivastava Java Cloud\\Day 6\\src\\com\\capgemini\\collections\\CellPhone.java");

		assertEquals("Line number 3 : import java.util.Objects;\n", PatternSearch.findString(file, "import"));
	}

}
