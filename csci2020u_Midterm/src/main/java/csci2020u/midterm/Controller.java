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
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Stage st;
    private Scene sc;
    private Parent r;
    @FXML
    private ImageView BRAXTON;

    @FXML
    public void toAnim(ActionEvent event) throws IOException{
        r = FXMLLoader.load(getClass().getResource("anim.fxml"));
        st = (Stage)((Node)event.getSource()).getScene().getWindow();
        sc = new Scene(r);
        st.setScene(sc);
        st.show();
    }

    public void toGraphic(ActionEvent event) throws IOException {
        Parent r = FXMLLoader.load(getClass().getResource("graphic.fxml"));
        st = (Stage)((Node)event.getSource()).getScene().getWindow();
        sc = new Scene(r);
        st.setScene(sc);
        st.show();
    }

    public void toAbout(ActionEvent event) throws IOException, ParserConfigurationException, SAXException {
        Parent r = FXMLLoader.load(getClass().getResource("about.fxml"));
        st = (Stage)((Node)event.getSource()).getScene().getWindow();
        sc = new Scene(r);
        st.setScene(sc);
        st.show();

        File getfile = new File(Objects.requireNonNull(Controller.class.getResource("aboutinfo.xml")).getPath());
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
        Document document = docBuilder.parse(getfile);
        document.getDocumentElement().normalize();

        NodeList list = document.getElementsByTagName("student");
        

    }

    public void toMidterm(ActionEvent event) throws IOException {
        Parent r = FXMLLoader.load(getClass().getResource("menu.fxml"));
        st = (Stage)((Node)event.getSource()).getScene().getWindow();
        sc = new Scene(r);
        st.setScene(sc);
        st.show();
    }

    public void initialize(URL arg0, ResourceBundle arg1){
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(BRAXTON);
        translate.setDuration(Duration.millis(2000));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByX(450);
        translate.setAutoReverse(true);
        translate.play();
    }



}
