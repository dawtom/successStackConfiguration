package examples;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("My first JavaFX app");

		initRootLayout();
	}

	public static void main(String[] args) {
		launch(args);
	}

	private void initRootLayout() {
		try {
			// load layout from FXML file
			FXMLLoader loader = new FXMLLoader();

			final String dir = System.getProperty("user.dir");
			System.out.println("current dir = " + dir);

			// FIXME to be refactored: names of resources files should not be written in code, they should also be resources
			loader.setLocation(Main.class.getResource("/examples/buttonExample.fxml"));
			GridPane rootLayout = (GridPane) loader.load();

			// add layout to a scene and show them all
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			System.out.println("Before show");
			primaryStage.show();
		} catch (IOException e) {
			// don't do this in common apps
			e.printStackTrace();
		}
	}
}
