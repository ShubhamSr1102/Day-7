package com.capgemini.filehandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.WordCount;

class WordCountTest {

	@Test
	void testWordCount() {
		File file = new File("C:\\Shubham Srivastava\\WorkSpace\\WordCountTest.txt");

		assertEquals(33, WordCount.countWords(file));
	}

}
