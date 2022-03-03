package csci2020u.lab04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RegistrationForm.class.getResource("sample.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 520);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
