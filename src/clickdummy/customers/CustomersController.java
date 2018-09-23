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
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class CustomersController implements Initializable {

	@FXML
    private AnchorPane mainRoot;
	
	@FXML
	private TableView<Customer> tableView;

	@FXML
	private TableColumn<Customer, String> name;

	@FXML
	private TableColumn<Customer, String> address;

	@FXML
	private TableColumn<Customer, String> phoneNumber;

	@FXML
	private Button addButton;

	@FXML
	private Button modifyButton;

	@FXML
	private Button backButon;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		name.setCellValueFactory(new PropertyValueFactory<Customer,String>("Name"));
		address.setCellValueFactory(new PropertyValueFactory<Customer,String>("Address"));
		phoneNumber.setCellValueFactory(new PropertyValueFactory<Customer,String>("PhoneNumber"));
		
		tableView.getItems().setAll(parseDummyCustomers());
		
		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	private List<Customer> parseDummyCustomers() {
		ObservableList<Customer> rentals = FXCollections.observableArrayList();
		
		rentals.add(new Customer("Adam Apples","Eden Garden","1"));
		rentals.add(new Customer("Bob Burgers","Fake Street","123 4567"));
		rentals.add(new Customer("Coca Cola","Pepsi Lane","987 6543"));
		
		return rentals;
	}

	@FXML
	void addButtonPressed(ActionEvent event) {

	}

	@FXML
	void backButtonPressed(ActionEvent event) {
		AnchorPane practiseRoot = null;
		try {
			practiseRoot = FXMLLoader.load(getClass().getResource("/resources/Main.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		mainRoot.getChildren().setAll(practiseRoot);
	}

	@FXML
	void modifyButtonPressed(ActionEvent event) {

	}
}
