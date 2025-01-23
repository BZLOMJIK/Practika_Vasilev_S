package ru.vasilev_semen.vasilev_s_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class sec {

    @FXML
    private Label nLabel;

    @FXML
    private TextField nText;

    @FXML
    void resOnAction(ActionEvent event) {
        int N = Integer.parseInt(nText.getText().toString());
        nLabel.setText("прошло секунд с начала последнего часа ="+ N % 3600);

    }

}
