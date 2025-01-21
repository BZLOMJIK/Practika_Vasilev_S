package ru.vasilev_s.vasilev_s_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Result {

    @FXML
    private Label Result;

    @FXML
    private TextField sText;

    @FXML
    private TextField tText;

    @FXML
    private TextField v1Text;

    @FXML
    private TextField v2Text;

    @FXML
    void resOnAction(ActionEvent event) {
        float V1= Float.parseFloat(v1Text.getText().toString());
        float V2= Float.parseFloat(v2Text.getText().toString());
        float S= Float.parseFloat(sText.getText().toString());
        float T= Float.parseFloat(tText.getText().toString());
        Result.setText("S2 ="+ ((S+T)*(V1+V2)));

    }

}
