package com.capgemini.filehandling.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class FileOperations {
	
	public static boolean reverse(String fileLink1, String fileLink2) {
		File file1 = new File(fileLink1);
		File file2 = new File(fileLink2);
		Stack<Character> stack = new Stack<>();
		try (BufferedReader bufferReader = new BufferedReader(new FileReader(file1))) {
			String lines;
			while ((lines = bufferReader.readLine()) != null) {
				
				for (int i = 0; i < lines.length(); i++) {
					stack.push(lines.charAt(i));
					System.out.print(lines.charAt(i));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (PrintWriter printWriter = new PrintWriter(file2)) {
			System.out.println(stack.size());
			int size = stack.size();
				for (int i = 0; i < size; i++) {
				printWriter.print(stack.pop());
			}
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean convert(String fileLink1, String fileLink2) {
		File file1 = new File(fileLink1);
		File file2 = new File(fileLink2);
		LinkedList<Character> queue = new LinkedList<Character>();
		try (FileReader fileReader = new FileReader(file1);
				BufferedReader bufferReader = new BufferedReader(fileReader)) {
			String lines;
			while ((lines = bufferReader.readLine()) != null) {
				for (int i = 0; i < lines.length(); i++) {
					queue.add(lines.charAt(i));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (PrintWriter printWriter = new PrintWriter(file2)) {
			System.out.println(queue.size());
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				printWriter.print(Character.toUpperCase(queue.removeFirst()));
			}
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean compare(String fileLink1, String fileLink2) {
		File file1 = new File(fileLink1);
		File file2 = new File(fileLink2);
		LinkedList<Character> queue1 = new LinkedList<Character>();
		LinkedList<Character> queue2 = new LinkedList<Character>();
		try (FileReader fileReader = new FileReader(file1);
				BufferedReader bufferReader = new BufferedReader(fileReader)) {
			String lines;
			while ((lines = bufferReader.readLine()) != null) {
				for (int i = 0; i < lines.length(); i++) {
					queue1.add(lines.charAt(i));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (FileReader fileReader = new FileReader(file2);
				BufferedReader bufferReader = new BufferedReader(fileReader)) {
			String lines;
			while ((lines = bufferReader.readLine()) != null) {
				for (int i = 0; i < lines.length(); i++) {
					queue2.add(lines.charAt(i));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int size1 = queue1.size();
		int size2 = queue2.size();
		if (queue1.equals(queue2)) {
			System.out.println("Same");
			return true;
		}
		return false;
	}
}