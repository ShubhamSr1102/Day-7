package com.capgemini.filehandling.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class VowelsAndConsonants {

	public static String findVowelAndConsonant(File file) throws IOException {
		HashSet<Character> vowels = new HashSet<Character>();
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		int vowelsCount = 0;
		int consonantCount = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String s = null;
			while ((s = reader.readLine()) != null) {
				for (int i = 0; i < s.length(); i++) {
					if (vowels.contains(s.charAt(i))) {
						vowelsCount++;
					} else if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
						consonantCount++;
					else {
					}
				}
			}
			return "Number of vowels = " + vowelsCount + "\nNumber of consonants = " + consonantCount;
		}

	}
}
