package de.BananenIQ.Timetable.AdvancedTimetable;

import java.util.HashMap;

public class StudentList{

	HashMap<Integer, Student> studentList = new HashMap<Integer, Student>();
	
	public StudentList() {
		
	}
	
	public StudentList(int studentId, Student student) {
		studentList.put(studentId, student);
	}

	public void put(int studentId, Student student) {
		studentList.put(studentId, student);
	}

	public Student get(int studenId) {
		return studentList.get(studenId);
	}

	public void remove(int studentId) {
		studentList.remove(studentId);

	}

	public int size() {
		return studentList.size();
	}

	public boolean containsKey(int studentId) {
		return studentList.containsKey(studentId);
	}

	public boolean isEmpty() {
		return studentList.isEmpty();
	}

	public void clear() {
		studentList.clear();
	}
}
