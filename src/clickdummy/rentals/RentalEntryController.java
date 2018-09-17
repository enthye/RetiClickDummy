package clickdummy.rentals;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RentalEntryController {

	@FXML
	private Button addButton;

	@FXML
	private Button cancelButton;

	@FXML
	private TextField startDateField;

	@FXML
	private TextField endDateField;

	@FXML
	private TextField customerField;

	@FXML
	private TextField carField;

	@FXML
	private TextField rentalRateField;

	@FXML
	void addButtonPressed(ActionEvent event) {
		
	}

	@FXML
	void cancelButtonPressed(ActionEvent event) {
		Stage stage = (Stage) cancelButton.getScene().getWindow();
	    stage.close();
	}

}
