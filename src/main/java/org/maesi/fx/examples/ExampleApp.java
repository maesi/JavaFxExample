package org.maesi.fx.examples;

import java.io.IOException;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExampleApp extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws MalformedURLException, IOException {
		primaryStage.setTitle("Example Application");
		Parent textSplitter = FXMLLoader.load(getClass().getResource("textSplitter.fxml"));
		primaryStage.setScene(new Scene(textSplitter));
		primaryStage.show();
	}
}