package clickdummy.rentals;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RentalEntryController {

	@FXML private AnchorPane mainRoot;
	@FXML private Button addButton,cancelButton;
	@FXML private TextField startDateField,endDateField,
	customerField,carField,rentalRateField;

	@FXML
	void addButtonPressed(ActionEvent event) {

	}

	@FXML
	void cancelButtonPressed(ActionEvent event) {
		AnchorPane root = null;

		try {
			root = FXMLLoader.load(getClass().getResource("/resources/Rentals.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		mainRoot.getChildren().setAll(root);
	}

}
