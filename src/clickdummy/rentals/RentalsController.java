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
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RentalsController implements Initializable {
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		startDateColumn.setCellValueFactory(new PropertyValueFactory<Rental,String>("StartDate"));
		endDateColumn.setCellValueFactory(new PropertyValueFactory<Rental,String>("EndDate"));
		carColumn.setCellValueFactory(new PropertyValueFactory<Rental,String>("Car"));
		customerColumn.setCellValueFactory(new PropertyValueFactory<Rental,String>("Customer"));
		rentalRateColumn.setCellValueFactory(new PropertyValueFactory<Rental,String>("RentalRate"));
		
		tableView.getItems().setAll(parseDummyRentals());
		
		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	private List<Rental> parseDummyRentals() {
		ObservableList<Rental> rentals = FXCollections.observableArrayList();
		
		rentals.add(new Rental("17/9/2018","24/9/2018","Tesla Model S","John Doe","Good Rate"));
		rentals.add(new Rental("17/9/2018","24/9/2018","Tesla Model S","John Doe","Good Rate"));
		rentals.add(new Rental("17/9/2018","24/9/2018","Nissan Leaf","Jane Doe","Bad Rate"));
		
		return rentals;
	}

	@FXML
	private AnchorPane mainRoot;
	
    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button searchButton;

    @FXML
    private Button backButton;

    @FXML
    private TableView<Rental> tableView;
        
    @FXML
    private TableColumn<Rental, String> startDateColumn;

    @FXML
    private TableColumn<Rental, String> endDateColumn;

    @FXML
    private TableColumn<Rental, String> customerColumn;

    @FXML
    private TableColumn<Rental, String> carColumn;

    @FXML
    private TableColumn<Rental, String> rentalRateColumn;
    
    @FXML
    private void addButtonPressed(ActionEvent event) {
    	Parent root = null;
    	
    	try {
			root = FXMLLoader.load(getClass().getResource("/resources/RentalEntry.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
        Stage stage = new Stage();
        stage.setTitle("New Rental");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void backButtonPressed(ActionEvent event) {
    	AnchorPane practiseRoot = null;
        try {
            practiseRoot = FXMLLoader.load(getClass().getResource("/resources/Main.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainRoot.getChildren().setAll(practiseRoot);
    }

    @FXML
    void deleteButtonPressed(ActionEvent event) {

    }

    @FXML
    void searchButtonPressed(ActionEvent event) {

    }

}