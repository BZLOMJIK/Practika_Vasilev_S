package ru.vasilev_s.vasilev_s_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class resh {

    @FXML
    private TextField aText;

    @FXML
    private TextField bText;

    @FXML
    private TextField cText;

    @FXML
    private Label resAC;

    @FXML
    private Label resBC;

    @FXML
    private Label resSum;

    @FXML
    void summOnAction(ActionEvent event) {
        float A= Float.parseFloat(aText.getText().toString());
        float B= Float.parseFloat(bText.getText().toString());
        float C= Float.parseFloat(cText.getText().toString());
        float AC = A * C;
        resAC.setText("AC= "+ AC);
        float BC = B * C;
        resBC.setText("BC ="+ BC);
        resSum.setText("Sum ="+ (A*C + B*C));

    }

}
