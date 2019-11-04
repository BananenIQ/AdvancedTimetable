
package de.BananenIQ.Timetable.AdvancedTimetable;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static final String name = "Adcanced Timetable";

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage HomeStage) throws Exception {
			new HomeStage(HomeStage, name);
	}
}
