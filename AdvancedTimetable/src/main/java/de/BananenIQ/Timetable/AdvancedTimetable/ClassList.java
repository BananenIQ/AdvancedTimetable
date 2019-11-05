package de.BananenIQ.Timetable.AdvancedTimetable;

import java.util.HashMap;

public class ClassList {
	
	HashMap<String, StudentList> classList = new HashMap<String, StudentList>();
	
	public ClassList(String classid, StudentList studentList){
		classList.put(classid, studentList);
	}
	
	public void put(String classid, StudentList studentList) {
		classList.put(classid, studentList);
	}
	
	public StudentList get(String classid) {
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
	
	public void clear(String classid) {
		classList.clear();
	}
	
	
}
