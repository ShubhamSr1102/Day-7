package com.capgemini.filehandling.domain;

import java.io.File;
import java.time.LocalDate;
import java.util.LinkedList;

public class HomeworkAssignment {
	private File file;
	private LocalDate dueDate;

	private static LinkedList<HomeworkAssignment> linked = new LinkedList<>();

	public HomeworkAssignment() {
		super();
	}

	public HomeworkAssignment(File file, LocalDate dueDate) {
		super();
		this.file = file;
		this.dueDate = dueDate;
	}

	public static boolean add(HomeworkAssignment assign) {
		if (linked.add(assign)) {
			return true;
		}
		return false;
	}

	public static boolean remove(HomeworkAssignment assign) {
		if (linked.remove(assign)) {
			return true;
		}
		return false;
	}

	public static void show() {
		for (HomeworkAssignment assignments : linked) {
			System.out.println(assignments);
		}
	}

	public static HomeworkAssignment fetchEarlyDueDate() {
		int result = 0;
		HomeworkAssignment first = linked.getFirst();
		for (HomeworkAssignment assignments : linked) {
			if (first.equals(assignments)) {
				continue;
			}
			result = assignments.dueDate.compareTo(first.dueDate);
			// System.out.println(result);
			if (result < 0) {
				first = assignments;
			}
		}
		System.out.println(first);
		return first;
	}

	@Override
	public String toString() {
		return "Assignments [assignmentName=" + file + ", dueDate=" + dueDate + "]";
	}
}