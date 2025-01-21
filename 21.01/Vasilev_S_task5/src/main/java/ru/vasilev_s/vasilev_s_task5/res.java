package ru.vasilev_s.vasilev_s_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class res {

    @FXML
    private Label ResultLabel;

    @FXML
    private TextField a1Text;

    @FXML
    private TextField a2Text;

    @FXML
    private TextField b1Text;

    @FXML
    private TextField b2Text;

    @FXML
    private TextField c1Text;

    @FXML
    private TextField c2Text;

    @FXML
    void resOnAction(ActionEvent event) {
        float A1 = Float.parseFloat(a1Text.getText().toString());
        float B1 = Float.parseFloat(b1Text.getText().toString());
        float C1 = Float.parseFloat(c1Text.getText().toString());
        float A2 = Float.parseFloat(a2Text.getText().toString());
        float B2 = Float.parseFloat(b2Text.getText().toString());
        float C2 = Float.parseFloat(c2Text.getText().toString());
        float D =((A1 *B2) - (A2 * B1));
        float x = (C1*B2 - C2 * B1)/ D;
        float y = (A1 * C2 -A2 * C1)/ D;
        if (D == 0)ResultLabel.setText("D=число равняется 0 ");
        else
            ResultLabel.setText("otvet="+ (A1 * x +B1 * y - C1)+"," + (A2 * x + B2 * y - C2));

    }

}
