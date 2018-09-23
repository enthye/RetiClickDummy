package clickdummy;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import utils.ChangeRootView;

public class MainController {

	@FXML private AnchorPane mainRoot;
    @FXML private Button rentalsButton,customersButton;
    private ChangeRootView crw = new ChangeRootView();

    @FXML
    private void customersButtonClicked(ActionEvent event) {
    	crw.changeRootView("/resources/Customers.fxml", mainRoot);
    }

    @FXML
    private void rentalsButtonClicked(ActionEvent event) {
    	crw.changeRootView("/resources/Rentals.fxml", mainRoot);
    }

}
