package ru.vasilev_s.vasilev_s_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class Result {

    @FXML
    private Label resp;

    @FXML
    private TextField xText;

    @FXML
    private TextField yText;

    @FXML
    void resOnAction(ActionEvent event) {
        float x = Float.parseFloat(xText.getText().toString());
        float y = Float.parseFloat(yText.getText().toString());
        float A = x+y;
        float B = (float) (pow(x,2) + pow(y,2));
        resp.setText("p ="+ (pow(A,2)+pow(B,2)) + (A*cos(A+B) + (A*sqrt(B)))/ (A+B));

    }

    }


