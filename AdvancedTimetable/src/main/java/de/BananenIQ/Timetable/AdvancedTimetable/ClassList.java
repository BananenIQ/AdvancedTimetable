package de.BananenIQ.Timetable.AdvancedTimetable;

import java.util.HashMap;

public class ClassList {

	HashMap<String, Class> classList = new HashMap<String, Class>();
	
	public ClassList(){
		
	}

	public ClassList(String classid, Class studentList) {
		classList.put(classid, studentList);
	}

	public void put(String classid, Class studentList) {
		classList.put(classid, studentList);
	}

	public Class get(String classid) {
		return classList.get(classid);
	}

	public void remove(String classid) {
		classList.remove(classid);

	}

	public int size() {
		return classList.size();
	}

	public boolean containsKey(String classid) {
		return classList.containsKey(classid);
	}

	public boolean isEmpty() {
		return classList.isEmpty();
	}

	public void clear() {
		classList.clear();
	}

}
