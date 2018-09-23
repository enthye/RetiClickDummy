package utils;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class ChangeRootView {
	public void changeRootView(String fxml, AnchorPane oldRoot) {
		AnchorPane newRoot = null;
        try {
            newRoot = FXMLLoader.load(getClass().getResource(fxml));
        } catch (IOException e) {
            e.printStackTrace();
        }
        oldRoot.getChildren().setAll(newRoot);
	}
}
