package ru.vasilev_semen.vasilev_s_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class abc {

    @FXML
    private TextField aText;

    @FXML
    private TextField bText;

    @FXML
    private TextField cText;

    @FXML
    private Label kLabel;

    @FXML
    private Label slabel;

    @FXML
    void resOnAction(ActionEvent event) {
        int A = Integer.parseInt(aText.getText());
        int B = Integer.parseInt(bText.getText());
        int C = Integer.parseInt(cText.getText());
        kLabel.setText("" + (A*B / (C * 4)));
        slabel.setText("" + (A*B % (C * 4)));



        }

    }
