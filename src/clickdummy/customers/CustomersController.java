package clickdummy.customers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import clickdummy.rentals.Rental;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import utils.ViewUtilities;

public class CustomersController implements Initializable {

	@FXML private AnchorPane mainRoot;
	@FXML private TableView<Customer> tableView;
	@FXML private TableColumn<Customer, String> name,address,phoneNumber;
	@FXML private Button addButton,modifyButton,backButon;
	private ViewUtilities vu = new ViewUtilities();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		name.setCellValueFactory(new PropertyValueFactory<Customer,String>("Name"));
		address.setCellValueFactory(new PropertyValueFactory<Customer,String>("Address"));
		phoneNumber.setCellValueFactory(new PropertyValueFactory<Customer,String>("PhoneNumber"));
		
		tableView.getItems().setAll(parseDummyCustomers());
		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	private List<Customer> parseDummyCustomers() {
		ObservableList<Customer> customers = FXCollections.observableArrayList();
		
		customers.add(new Customer("Adam Apples","123 4567","Eden Garden"));
		
		return customers;
	}

	@FXML
	void addButtonPressed(ActionEvent event) {
		vu.newWindowView("/resources/CustomerEntry.fxml");
	}

	@FXML
	void backButtonPressed(ActionEvent event) {
		vu.changeRootView("/resources/Main.fxml", mainRoot);
	}

	@FXML
	void modifyButtonPressed(ActionEvent event) {
		Customer customer = tableView.getSelectionModel().getSelectedItem();
		if (customer != null) {
			vu.newWindowView("/resources/ModifyEntry.fxml");
		} else {
			Alert alert = new Alert(AlertType.ERROR,"No customer selected");
			alert.showAndWait();
		}
		
	}
}
