package com.capgemini.filehandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.VowelsAndConsonants;

class VowelsAndConsonantsTest {

	@Test
	void testVowelsAndConsonants() throws IOException {
		File file = new File("C:\\\\Shubham Srivastava\\\\WorkSpace\\\\WordCountTest.txt");

		assertEquals("Number of vowels = 53\nNumber of consonants = 85",
				VowelsAndConsonants.findVowelAndConsonant(file));
	}

}
