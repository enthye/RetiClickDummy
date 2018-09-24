package utils;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewUtilities {
	public void changeRootView(String fxml, AnchorPane oldRoot) {
		AnchorPane newRoot = null;
        try {
            newRoot = FXMLLoader.load(getClass().getResource(fxml));
        } catch (IOException e) {
            e.printStackTrace();
        }
        oldRoot.getChildren().setAll(newRoot);
	}
	
	public void newWindowView (String fxml) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource(fxml));
			Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
		}catch (IOException e) {
			
		}
	}
}
