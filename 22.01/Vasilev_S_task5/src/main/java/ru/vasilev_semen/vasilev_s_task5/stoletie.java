package ru.vasilev_semen.vasilev_s_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class stoletie {

    @FXML
    private TextField godText;

    @FXML
    private Label resLabel;

    @FXML
    void resOnAction(ActionEvent event) {
        int A = Integer.parseInt(godText.getText().toString());
        A = A / 100;
        resLabel.setText("столетие ="+ (A+1));

    }

}
