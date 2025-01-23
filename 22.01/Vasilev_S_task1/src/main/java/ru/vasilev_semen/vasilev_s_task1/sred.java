package ru.vasilev_semen.vasilev_s_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class sred {

    @FXML
    private TextField aText;

    @FXML
    private TextField bText;

    @FXML
    private Label resLabel;

    @FXML
    void resOnAction(ActionEvent event) {
        int A = Integer.parseInt(aText.getText().toString());
        int B = Integer.parseInt(bText.getText().toString());
        resLabel.setText("otrezkov="+  A / B);

    }

}
