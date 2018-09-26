package clickdummy.rentals;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RentalSearchController {

    @FXML private AnchorPane root;
    @FXML private Button searchButton,cancelButton;
    @FXML private TextField startDateField,endDateField,
    customerField,carField,carTypeField,rentalRateField;

    @FXML
    void cancelButtonPressed(ActionEvent event) {
    	Stage stage = (Stage) cancelButton.getScene().getWindow();
	    stage.close();
    }

    @FXML
    void searchButtonPressed(ActionEvent event) {
    	Stage stage = (Stage) searchButton.getScene().getWindow();
	    stage.close();
    }

}
