package de.BananenIQ.Timetable.AdvancedTimetable;

import javafx.scene.control.TextField;

public class Student {

	private String fistname = null;
	private String lastname = null;
	private String classid = null;
	private String timetable = null;
	private String id = null;

	public Student(TextField fistname, TextField lastname, TextField classid, TextField timetable, TextField id) {

		this.fistname = fistname.getText();
		this.lastname = lastname.getText();
		this.classid = classid.getText();
		this.timetable = timetable.getText();
		this.id = id.getText();

	}

	public String getFistname() {
		return fistname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getClassid() {
		return classid;
	}

	public String getTimetable() {
		return timetable;
	}

	public String getid() {
		return id;
	}
}
