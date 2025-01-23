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
        int A = Integer.parseInt(aText.getText().toString());
        int B = Integer.parseInt(bText.getText().toString());
        int C = Integer.parseInt(cText.getText().toString());
        int AB = (A * B);
        if ((C < A) && (C < B))
        {

            kLabel.setText("kolvo =" + (A/C)*(B/C));
            slabel.setText("S =" + ((A*B) - (((A/C)*(B/C))*(C*C))));
        }else{
            kLabel.setText("kolvo =квадрат больше прямоугольника");
            slabel.setText("S=не удалось вычислить");



        }

    }
}