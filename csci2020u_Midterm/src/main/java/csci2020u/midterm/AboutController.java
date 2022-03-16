package csci2020u.midterm;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AboutController implements Initializable {

    private Stage st;
    private Scene sc;
    private Parent r;
    @FXML
    private ImageView BRAXTON;

    @FXML
    public void toMidterm(ActionEvent event) throws IOException {
        Parent r = FXMLLoader.load(getClass().getResource("menu.fxml"));
        st = (Stage)((Node)event.getSource()).getScene().getWindow();
        sc = new Scene(r);
        st.setScene(sc);
        st.show();
    }

    public void initialize(URL arg0, ResourceBundle arg1){
    }

}
