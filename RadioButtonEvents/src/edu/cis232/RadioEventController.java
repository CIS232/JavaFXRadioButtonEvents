package edu.cis232;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class RadioEventController {

	@FXML
	private ToggleGroup color;

	@FXML
	private Circle circle;

	@FXML
	private Label lblHint;

	@FXML
	void radioEventListener(ActionEvent event) {
		lblHint.setVisible(false);
		
		RadioButton button = (RadioButton) event.getSource();
		
		switch (button.getText()) {
		case "Orange":
			circle.setFill(Color.ORANGE);
			break;
		case "Black":
			circle.setFill(Color.BLACK);
			break;
		case "Yellow":
			circle.setFill(Color.YELLOW);
			break;
		default:
			circle.setFill(Color.WHITESMOKE);
			break;
		}
	}

}
