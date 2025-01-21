package ru.vasilev_s.vasilev_s_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.PI;

public class Res {

    @FXML
    private Label Res;

    @FXML
    private TextField dText;

    @FXML
    void resOnAction(ActionEvent event) {
        float D= Float.parseFloat(dText.getText().toString());
        Res.setText("L = "+ PI*D);

    }

}
