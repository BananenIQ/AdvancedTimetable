package de.BananenIQ.Timetable.AdvancedTimetable;

import java.util.HashMap;

public class Class {

	HashMap<Integer, Student> classHM = new HashMap<Integer, Student>();

	public Class(int studentId, Student student) {
		classHM.put(studentId, student);
	}

	public void put(int studentId, Student student) {
		classHM.put(studentId, student);
	}

	public Student get(int studenId) {
		return classHM.get(studenId);
	}

	public void remove(int studentId) {
		classHM.remove(studentId);

	}

	public int size() {
		return classHM.size();
	}

	public boolean containsKey(int studentId) {
		return classHM.containsKey(studentId);
	}

	public boolean isEmpty() {
		return classHM.isEmpty();
	}

	public void clear() {
		classHM.clear();
	}

}
