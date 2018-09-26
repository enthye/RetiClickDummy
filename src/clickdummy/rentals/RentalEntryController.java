package clickdummy.rentals;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RentalEntryController {
	@FXML private AnchorPane mainRoot;
	@FXML private Button addButton,cancelButton;
	@FXML private TextField startDateField,endDateField,
	customerField,carField,rentalRateField;

	@FXML
	void addButtonPressed(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION,"New rental added!");
		alert.showAndWait();
		Stage stage = (Stage) addButton.getScene().getWindow();
	    stage.close();
	}

	@FXML
	void cancelButtonPressed(ActionEvent event) {
		Stage stage = (Stage) cancelButton.getScene().getWindow();
	    stage.close();
	}
	
}
