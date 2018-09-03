package com.capgemini.filehandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.FileOperations;

class FileOperationsTest {

	@Test
	void testReverse() {
		assertEquals(true, FileOperations.reverse("C:\\Shubham Srivastava\\WorkSpace\\Sample.txt","C:\\Shubham Srivastava\\WorkSpace\\ReverseOutput.txt"));
		assertEquals(true, FileOperations.convert("C:\\Shubham Srivastava\\WorkSpace\\Sample.txt","C:\\Shubham Srivastava\\WorkSpace\\ConvertOutput.txt"));
		assertEquals(true, FileOperations.compare("C:\\Shubham Srivastava\\WorkSpace\\Sample.txt","C:\\Shubham Srivastava\\WorkSpace\\WordCountTest.txt"));
	}
}
