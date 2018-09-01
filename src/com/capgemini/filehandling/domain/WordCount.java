package com.capgemini.filehandling.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static int countWords(File file) {
		int count = 0;
		try (BufferedReader reader = new BufferedReader( new FileReader(file))) {

			String s=null;
			while ((s = reader.readLine()) != null) {
				int ct=1;
				for(int i = 0; i < s.length();i++)
				{
					if(s.charAt(i)==' ')
					{
						ct++;
					}
				}
				count = count + ct;
			}
			return count;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return -1;
	}

}
