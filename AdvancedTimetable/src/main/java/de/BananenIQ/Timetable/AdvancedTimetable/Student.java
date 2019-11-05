package de.BananenIQ.Timetable.AdvancedTimetable;

import javafx.scene.control.TextField;

public class Student {

	private String firstname = null;
	private String lastname = null;
	private String classId = null;
	private String timetable = null;
	private String id = null;

	public Student(TextField firstname, TextField lastname, TextField classId, TextField timetable, TextField id) {

		this.firstname = firstname.getText();
		this.lastname = lastname.getText();
		this.classId = classId.getText();
		this.timetable = timetable.getText();
		this.id = id.getText();

	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getClassId() {
		return classId;
	}

	public String getTimetable() {
		return timetable;
	}

	public String getId() {
		return id;
	}
}
