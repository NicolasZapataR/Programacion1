package co.edu.uniquindio.poo.viewController;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginPrincipalViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="buttonAdmin"
    private Button buttonAdmin; // Value injected by FXMLLoader

    @FXML // fx:id="buttonEmpleado"
    private Button buttonEmpleado; // Value injected by FXMLLoader

    @FXML
    void adminAction(ActionEvent event) {

    }

    @FXML
    void empleadoAction(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert buttonAdmin != null : "fx:id=\"buttonAdmin\" was not injected: check your FXML file 'LoginPrincipal.fxml'.";
        assert buttonEmpleado != null : "fx:id=\"buttonEmpleado\" was not injected: check your FXML file 'LoginPrincipal.fxml'.";

    }

}



