package de.BananenIQ.Timetable.AdvancedTimetable;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentAddScene {
	Student student;

	public StudentAddScene(BorderPane root) {

		StudentList studentList = new StudentList();

		HBox pane = new HBox();
		VBox userpane = new VBox();
		pane.setSpacing(10);
		userpane.setSpacing(10);

		root.setCenter(userpane);
		root.setLeft(pane);

		TableView<Student> tableList = new TableView<Student>();

		TableColumn<Student, String> tcFirstname = new TableColumn<Student, String>("Firstname");
		tcFirstname.setCellValueFactory(new PropertyValueFactory<>("firstname"));

		TableColumn<Student, String> tcLastname = new TableColumn<Student, String>("Lastname");
		tcLastname.setCellValueFactory(new PropertyValueFactory<>("lastname"));

		TableColumn<Student, String> tcClassid = new TableColumn<Student, String>("Class");
		tcClassid.setCellValueFactory(new PropertyValueFactory<>("classId"));

		TableColumn<Student, String> tcTimetable = new TableColumn<Student, String>("Timetable");
		tcTimetable.setCellValueFactory(new PropertyValueFactory<>("timetable"));

		TableColumn<Student, String> tcId = new TableColumn<Student, String>("ID");
		tcId.setCellValueFactory(new PropertyValueFactory<>("id"));

		if (!(studentList.isEmpty())) {
			//Die Liste widerherstellen aus der studentlist in die tabelList
		}

		tableList.getColumns().addAll(tcFirstname, tcLastname, tcClassid, tcTimetable, tcId);
		pane.getChildren().addAll(tableList);

		final TextField tfFistname = new TextField("fistname");
		final TextField tfLastname = new TextField("lastname");
		final TextField tfClassid = new TextField("classid");
		final TextField tfTimetable = new TextField("timetable");
		final TextField tfId = new TextField("id");

		tfId.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d*")) {
					tfId.setText(newValue.replaceAll("[^\\d]", ""));
				}
			}
		});

		Button btSave = new Button("Save Student");
		btSave.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (studentList.isEmpty()) {
					Student student = new Student(tfFistname, tfLastname, tfClassid, tfTimetable, tfId);
					tableList.getItems().add(student);
					studentList.put(Integer.parseInt(tfId.getText()), student);
				} else if (!(studentList.containsKey(Integer.parseInt(tfId.getText())))) {
					tableList.getItems().add(new Student(tfFistname, tfLastname, tfClassid, tfTimetable, tfId));
					studentList.put(Integer.parseInt(tfId.getText()), student);
				} else {
					Alert alert = new Alert(AlertType.ERROR);
					Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
					stage.getIcons().add(new Image("file:images/icon_advanced_Timetabke.png"));

					alert.setTitle("Student add Error");
					alert.setHeaderText("You use an existing ID!");
					alert.setContentText("Please change the ID and try it again");
					alert.showAndWait();

				}
			}
		});

		userpane.getChildren().addAll(tfFistname, tfLastname, tfClassid, tfTimetable, tfId, btSave);
	}

}
