package edu.cis232;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Load the fxml
		AnchorPane root = FXMLLoader.load(getClass().getResource("RadioEvent.fxml"));
		
		//Build the scene graph
		Scene scene = new Scene(root);
		
		//Set & show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Radio Button Events");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
