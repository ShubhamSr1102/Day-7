package com.capgemini.filehandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.HomeworkAssignment;

class HomeworkAssignmentTest {

	@Test
	void testHomeworkAssignment() {
		HomeworkAssignment assign1 = null;
		HomeworkAssignment assign2 = null;
		HomeworkAssignment assign3 = null;
		HomeworkAssignment assign4 = null;
		File file = new File("C:\\Shubham Srivastava\\WorkSpace\\Exception Handling.txt");
		if (file.exists() && file.isFile()) {
			assign1 = new HomeworkAssignment(file, LocalDate.of(2018, 8, 22));
		}
		file = new File("C:\\Shubham Srivastava\\WorkSpace\\File Handling.txt");
		if (file.exists() && file.isFile()) {
			assign2 = new HomeworkAssignment(file, LocalDate.of(2018, 9, 3));
		}
		file = new File("C:\\Shubham Srivastava\\WorkSpace\\Collection.txt");
		if (file.exists() && file.isFile()) {
			assign3 = new HomeworkAssignment(file, LocalDate.of(2019, 8, 26));
		}
		file = new File("C:\\Shubham Srivastava\\WorkSpace\\Bank Account.txt");
		if (file.exists() && file.isFile()) {
			assign4 = new HomeworkAssignment(file, LocalDate.of(2018, 8, 20));
		}
		assertEquals(true, HomeworkAssignment.add(assign1));
		assertEquals(true, HomeworkAssignment.add(assign2));
		assertEquals(true, HomeworkAssignment.add(assign3));
		assertEquals(true, HomeworkAssignment.add(assign4));
		assertEquals(true, HomeworkAssignment.remove(assign1));
		HomeworkAssignment.show();
		System.out.println("\n");
		assertEquals(assign4, HomeworkAssignment.fetchEarlyDueDate());
	}
}
