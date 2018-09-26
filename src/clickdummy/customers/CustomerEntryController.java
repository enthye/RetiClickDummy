package clickdummy.customers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CustomerEntryController {

	@FXML private TextField addressField,phoneField,nameField;
    @FXML private Button addButton,cancelButton;
    @FXML private AnchorPane mainRoot;

    @FXML
    void addButtonPressed(ActionEvent event) {
    	Alert alert;
    	
    	if (nameField.getText().isEmpty() || nameField.getText() == null) {
    		alert = new Alert(AlertType.ERROR,"Name is empty");
    		alert.showAndWait();
    	} else {
    		alert = new Alert(AlertType.INFORMATION,"New customer added!");
    		alert.showAndWait();
    		Stage stage = (Stage) addButton.getScene().getWindow();
    	    stage.close();
    	}
    	
    	
    }

    @FXML
    void cancelButtonPressed(ActionEvent event) {
    	Stage stage = (Stage) cancelButton.getScene().getWindow();
	    stage.close();
    }

}
