package clickdummy.customers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CustomersController {

	@FXML
	private TableView<?> tableView;

	@FXML
	private TableColumn<?, ?> name;

	@FXML
	private TableColumn<?, ?> address;

	@FXML
	private TableColumn<?, ?> phoneNumber;

	@FXML
	private Button addButton;

	@FXML
	private Button modifyButton;

	@FXML
	private Button backButon;

	@FXML
	void addButtonPressed(ActionEvent event) {

	}

	@FXML
	void backButtonPressed(ActionEvent event) {

	}

	@FXML
	void modifyButtonPressed(ActionEvent event) {

	}

}
