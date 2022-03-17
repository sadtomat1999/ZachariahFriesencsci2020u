package csci2020u.lab06;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.StyleClass;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private BarChart<?, ?> bar_Chart;

    private static double[] avgHousingPricesByYear = {
            247381.0,264171.4,287715.3,294736.1,
            308431.4,322635.9,340253.0,363153.7
    };
    private static double[] avgCommercialPricesByYear = {
            1121585.3,1219479.5,1246354.2,1295364.8,
            1335932.6,1472362.0,1583521.9,1613246.3
    };

    @FXML
    private PieChart pie_Chart;

    private static String[] ageGroups = {
            "18-25", "26-35", "36-45", "46-55", "56-65", "65+"
    };
    private static int[] purchasesByAgeGroup = {
            648, 1021, 2453, 3173, 1868, 2247
    };
    private static Color[] pieColours = {
            Color.AQUA, Color.GOLD, Color.DARKORANGE,
            Color.DARKSALMON, Color.LAWNGREEN, Color.PLUM
    };

    @Override
    public void initialize(URL url, ResourceBundle resbundle){
        XYChart.Series s1 = new XYChart.Series<>();
        s1.setName("AvgHousing");
        s1.getData().add(new XYChart.Data("1", avgHousingPricesByYear[0]));
        s1.getData().add(new XYChart.Data("2", avgHousingPricesByYear[1]));
        s1.getData().add(new XYChart.Data("3", avgHousingPricesByYear[2]));
        s1.getData().add(new XYChart.Data("4", avgHousingPricesByYear[3]));
        s1.getData().add(new XYChart.Data("5", avgHousingPricesByYear[4]));
        s1.getData().add(new XYChart.Data("6", avgHousingPricesByYear[5]));
        s1.getData().add(new XYChart.Data("7", avgHousingPricesByYear[6]));
        s1.getData().add(new XYChart.Data("8", avgHousingPricesByYear[7]));

        XYChart.Series s2 = new XYChart.Series<>();
        s2.setName("AvgCommercial");
        s2.getData().add(new XYChart.Data<>("1", avgCommercialPricesByYear[0]));
        s2.getData().add(new XYChart.Data<>("2", avgCommercialPricesByYear[1]));
        s2.getData().add(new XYChart.Data<>("3", avgCommercialPricesByYear[2]));
        s2.getData().add(new XYChart.Data<>("4", avgCommercialPricesByYear[3]));
        s2.getData().add(new XYChart.Data<>("5", avgCommercialPricesByYear[4]));
        s2.getData().add(new XYChart.Data<>("6", avgCommercialPricesByYear[5]));
        s2.getData().add(new XYChart.Data<>("7", avgCommercialPricesByYear[6]));
        s2.getData().add(new XYChart.Data<>("8", avgCommercialPricesByYear[7]));

        bar_Chart.getData().addAll(s1,s2);

        ObservableList<PieChart.Data> pi = FXCollections.observableArrayList(new PieChart.Data(ageGroups[0], purchasesByAgeGroup[0]), new PieChart.Data(ageGroups[1], purchasesByAgeGroup[1]), new PieChart.Data(ageGroups[2], purchasesByAgeGroup[2]), new PieChart.Data(ageGroups[3], purchasesByAgeGroup[3]), new PieChart.Data(ageGroups[4], purchasesByAgeGroup[4]), new PieChart.Data(ageGroups[5], purchasesByAgeGroup[5]));

        pie_Chart.getData().addAll(pi);

    }


}
