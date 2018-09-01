package com.capgemini.filehandling.test;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.BinaryInteger;

class BinaryIntegerTest {

	@Test
	void testBinaryInteger() {
		File file = new File("C:\\Shubham Srivastava\\WorkSpace\\CreateData.dat");
		assertEquals(1,BinaryInteger.writeBinary(file));
	}

}
