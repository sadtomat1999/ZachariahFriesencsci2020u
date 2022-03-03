package csci2020u.lab04;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistrationController {

    @FXML
    private TextField usernameInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    private TextField fullnameInput;

    @FXML
    private TextField emailInput;

    @FXML
    private TextField phoneInput;

    @FXML
    private DatePicker doaInput;

    @FXML
    public void printInfo() {
        System.out.println(usernameInput.getText());
        System.out.println(passwordInput.getText());
        System.out.println(fullnameInput.getText());
        System.out.println(emailInput.getText());
        System.out.println(phoneInput.getText());
        System.out.println(doaInput.getValue());
    }

}
