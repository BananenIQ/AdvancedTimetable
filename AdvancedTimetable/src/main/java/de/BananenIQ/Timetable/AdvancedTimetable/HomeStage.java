package de.BananenIQ.Timetable.AdvancedTimetable;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HomeStage {
	public HomeStage(final Stage homeStage, String name) {
		homeStage.setTitle(name);
		homeStage.getIcons().add(new Image("file:images/icon_advanced_Timetabke.png"));

		final BorderPane root = new BorderPane();

		MenuBar menuBar = new MenuBar();

		Menu menu = new Menu("Menu");
		menu.setGraphic(new ImageView("file:images/icon_menu.png"));

		MenuItem search = new MenuItem("Search");
		search.setGraphic(new ImageView("file:images/icon_search.png"));

		MenuItem openStudentList = new MenuItem("Open Student list");
		openStudentList.setGraphic(new ImageView("file:images/icon_student.png"));

		MenuItem openClassList = new MenuItem("Open Class list");
		openClassList.setGraphic(new ImageView("file:images/icon_class.png"));

		MenuItem openTimetable = new MenuItem("Open Timetable");
		openTimetable.setGraphic(new ImageView("file:images/icon_timetable.png"));

		MenuItem openAttendanceList = new MenuItem("Open Attendance list");
		openAttendanceList.setGraphic(new ImageView("file:images/icon_attendance.png"));

		MenuItem createStudent = new MenuItem("Create Student");
		createStudent.setGraphic(new ImageView("file:images/icon_add_user.png"));
		createStudent.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				new StudentAddScene(root);
			}
		});

		MenuItem createClass = new MenuItem("Create Class");
		createClass.setGraphic(new ImageView("file:images/icon_add_user_group.png"));

		MenuItem createTimetable = new MenuItem("Create Timetable");
		createTimetable.setGraphic(new ImageView("file:images/icon_timetable.png"));

		MenuItem importStudentList = new MenuItem("Import Student list");
		importStudentList.setGraphic(new ImageView("file:images/icon_import_student.png"));

		MenuItem importClass = new MenuItem("Import Class");
		importClass.setGraphic(new ImageView("file:images/icon_import_class.png"));

		MenuItem importTimetable = new MenuItem("Import Timetable");
		importTimetable.setGraphic(new ImageView("file:images/icon_timetable.png"));

		MenuItem importAttendanceList = new MenuItem("Import Attendance list");
		importAttendanceList.setGraphic(new ImageView("file:images/icon_attendance.png"));

		menu.getItems().addAll(search, openStudentList, openClassList, openTimetable, openAttendanceList, createStudent,
				createClass, createTimetable, importStudentList, importClass, importTimetable, importAttendanceList);

		Menu Settings = new Menu("Settings");
		Settings.setGraphic(new ImageView("file:images/icon_settings.png"));

		Menu Info = new Menu("Info");
		Info.setGraphic(new ImageView("file:images/icon_info.png"));
		MenuItem dev = new MenuItem("Dev Info");
		dev.setGraphic(new ImageView("file:images/icon_user_info.png"));
		dev.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Info");
				alert.setHeaderText(
						"Dev: BananenIQ\n" + "Email: krystianprzywozny@gmail.com\n" + "Copyright: Apache-License 2.0");
				alert.initOwner(homeStage);
				alert.setContentText("It's a Timetable but much more advanced!");
				alert.showAndWait();
			}
		});

		MenuItem version = new MenuItem("Version");
		version.setGraphic(new ImageView("file:images/icon_version.png"));
		version.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Info");
				alert.setHeaderText("Version: 0.0.1\n" + "Licence: Open-Source\n");
				FlowPane fp = new FlowPane();
				Label lbl = new Label("Link: ");
				Hyperlink link = new Hyperlink("https://github.com/BananenIQ/AdvancedTimetable");
				fp.getChildren().addAll(lbl, link);
				link.setOnAction((evt) -> {
					alert.close();
					try {
						Desktop.getDesktop().browse(new URI("https://github.com/BananenIQ/AdvancedTimetable"));
					} catch (IOException e) {				
						e.printStackTrace();
					} catch (URISyntaxException e) {
						e.printStackTrace();
					}
				});
				alert.getDialogPane().contentProperty().set(fp);
				alert.initOwner(homeStage);
				alert.showAndWait();
				
			}
		});
		

		Info.getItems().addAll(dev, version);

		menuBar.getMenus().addAll(menu, Settings, Info);

		root.setTop(menuBar);

		Scene scene = new Scene(root, 1500, 800);

		homeStage.setScene(scene);

		scene.getStylesheets().add("file:styles/Style.css");
		homeStage.show();
	}
}
