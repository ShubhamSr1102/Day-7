package com.capgemini.filehandling.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {

	public static int count(File file) {

		int ct = 0;
		try (FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader);) {

			String s;
			while ((s = reader.readLine()) != null)
				ct++;

		} catch (IOException e) {
			e.printStackTrace();
		}

		return ct;
	}
}
