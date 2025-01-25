package ru.vasilev_semen.vasilev_s_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dni {

    @FXML
    private TextField kText;

    @FXML
    private Label resLable;

    @FXML
    void resOnAction(ActionEvent event) {
        int K = Integer.parseInt(kText.getText().toString());
        if (K >= 364 || K < 0)resLable.setText("неверное число");
        K = (K % 7);
        switch (K){
            case (2):
            resLable.setText("день недели понедельник "+ (K+1));
            break;
            case (3):
                resLable.setText("день недели вторник "+ (K+1));
                break;
            case (4):
                resLable.setText("день недели среда "+ (K+1));
                break;
            case (5):
                resLable.setText("день недели четверг "+ (K+1));
                break;
            case (6):
                resLable.setText("день недели пятница "+ (K+1));
                break;
            case (0):
                resLable.setText("день недели суббота "+ (K+1));
                break;
            case (1):
                resLable.setText("день недели воскресенье "+ (K+1));
                break;
        }

    }

}
