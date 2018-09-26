package clickdummy.customers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ModifyController {

    @FXML private AnchorPane mainRoot;
    @FXML private TextField nameField,phoneNumberField,addressField;
    @FXML private Button modifyButton,cancelButton;

    @FXML
    void modifyButtonPressed(ActionEvent event) {
    	Stage stage = (Stage) modifyButton.getScene().getWindow();
	    stage.close();
    }

    @FXML
    void cancelButtonPressed(ActionEvent event) {
    	Stage stage = (Stage) cancelButton.getScene().getWindow();
	    stage.close();
    }

}
