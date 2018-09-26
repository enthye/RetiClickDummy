package clickdummy.rentals;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utils.ViewUtilities;

public class RentalsController implements Initializable {
	
	@FXML private AnchorPane mainRoot;
    @FXML private Button addButton, deleteButton,searchButton,backButton;
    @FXML private TableView<Rental> tableView;
    @FXML private TableColumn<Rental, String> startDateColumn,
    endDateColumn,customerColumn,carColumn,rentalRateColumn;
    private ViewUtilities vu = new ViewUtilities();
    private List<Rental> dummyList;
    
    @FXML
    private void addButtonPressed(ActionEvent event) {  	
    	vu.newWindowView("/resources/RentalEntry.fxml");
    }

    @FXML
    private void backButtonPressed(ActionEvent event) {
    	vu.changeRootView("/resources/Main.fxml", mainRoot);
    }

    @FXML
    void deleteButtonPressed(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION,"Delete Rental made by <Customer>?");
    	alert.showAndWait();
    	
    	if (alert.getResult() == ButtonType.OK) {
    		// delete
    	} else {
    		// return
    	}
    }

    @FXML
    void searchButtonPressed(ActionEvent event) {
    	dummySearch();
    	vu.newWindowView("/resources/RentalSearch.fxml");
    }
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		startDateColumn.setCellValueFactory(new PropertyValueFactory<Rental,String>("StartDate"));
		endDateColumn.setCellValueFactory(new PropertyValueFactory<Rental,String>("EndDate"));
		customerColumn.setCellValueFactory(new PropertyValueFactory<Rental,String>("Customer"));
		carColumn.setCellValueFactory(new PropertyValueFactory<Rental,String>("Car"));
		rentalRateColumn.setCellValueFactory(new PropertyValueFactory<Rental,String>("RentalRate"));
		
		dummyList = parseDummyRentals();
		tableView.getItems().setAll(dummyList);
		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	private List<Rental> parseDummyRentals() {
		ObservableList<Rental> rentals = FXCollections.observableArrayList();
		
		rentals.add(new Rental("17/9/2018","24/9/2018","John Doe","Sports: Tesla Model S","Good Rate"));
		rentals.add(new Rental("17/9/2018","24/9/2018","Ah Name","Sports: Tesla Model S","Ok Rate"));
		rentals.add(new Rental("17/9/2018","24/9/2018","Jane Doe","Passenger: Nissan Leaf","Bad Rate"));
		
		return rentals;
	}
	
	private void dummySearch() {
		dummyList.clear();
		dummyList.add(new Rental("17/9/2018","24/9/2018","John Doe","Sports: Tesla Model S","Good Rate"));
		tableView.getItems().setAll(dummyList);
	}

}