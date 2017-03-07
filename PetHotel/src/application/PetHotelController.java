
/**
 * Sample Skeleton for 'PetHotel' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PetHotelController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="outputField"
    private TextArea outputField; // Value injected by FXMLLoader

    @FXML // fx:id="ownerTextField"
    private TextField ownerTextField; // Value injected by FXMLLoader

    @FXML // fx:id="petTextField"
    private TextField petTextField; // Value injected by FXMLLoader

    @FXML // fx:id="daysTextField"
    private TextField daysTextField; // Value injected by FXMLLoader

    @FXML
    void insertClient(MouseEvent event) {
    	String owner = ownerTextField.getText();
    	String pet = petTextField.getText();
    	int days = Integer.parseInt(daysTextField.getText());
        
    	outputField.setText("New client inserted!\n" + owner + " " + pet + " " + " " + days);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert outputField != null : "fx:id=\"outputField\" was not injected: check your FXML file 'Untitled'.";
        assert ownerTextField != null : "fx:id=\"ownerTextField\" was not injected: check your FXML file 'Untitled'.";
        assert petTextField != null : "fx:id=\"petTextField\" was not injected: check your FXML file 'Untitled'.";
        assert daysTextField != null : "fx:id=\"daysTextField\" was not injected: check your FXML file 'Untitled'.";

    }
}
