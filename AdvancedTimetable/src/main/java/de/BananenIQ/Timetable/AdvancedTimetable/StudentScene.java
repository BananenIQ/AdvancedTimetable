package de.BananenIQ.Timetable.AdvancedTimetable;

import java.util.Observable;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class StudentScene {
	Student student;

	public StudentScene(BorderPane root) {
		HBox pane = new HBox();
		VBox userpane = new VBox();
		pane.setSpacing(10);
		userpane.setSpacing(10);

		root.setCenter(userpane);
		root.setLeft(pane);

		TableView<Student> tableList = new TableView<Student>();
		TableColumn<Student, String> tcFistname = new TableColumn<Student, String>("Fistname");
		TableColumn<Student, String> tcLastname = new TableColumn<Student, String>("Lastname");
		TableColumn<Student, String> tcClassid = new TableColumn<Student, String>("Class");
		TableColumn<Student, String> tcTimetable = new TableColumn<Student, String>("Timetable");
		TableColumn<Student, String> tcId = new TableColumn<Student, String>("ID");

		
		tableList.getColumns().addAll(tcFistname, tcLastname, tcClassid, tcTimetable, tcId);
		pane.getChildren().addAll(tableList);
		
	    
		
	    
	    
		
		final TextField tfFistname = new TextField("fistname");
		final TextField tfLastname = new TextField("lastname");
		final TextField tfClassid = new TextField("classid");
		final TextField tfTimetable = new TextField("timetable");
		final TextField tfId = new TextField("id");
		Button btSave = new Button("Save Student");
		btSave.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				
				
				
			    
			}
		});

		userpane.getChildren().addAll(tfFistname, tfLastname, tfClassid, tfTimetable, tfId, btSave);
	}
	
	
}
